#define _GNU_SOURCE
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>

int main() {
    char *cmds[] = {"sleep 2 & pwd", "sleep 4 & ls", "sleep 1 & ps", "sleep 3 & (ps aux | grep pwd)", "hostname"};
    pid_t pids[5];
    int active_children = 5;

    // 1. Spawn 5 children
    for (int i = 0; i < 5; i++) {
        pids[i] = fork();
        if (pids[i] == 0) {
            char *args[] = {"sh", "-c", cmds[i], NULL};
            execvpe("sh", args, NULL);
            exit(1);
        }
    }

    // 2. Parent's Non-Blocking "Work & Check" Loop
    printf("Parent: Doing my own work while children run...\n");
    while (active_children > 0) {
        int status;
        // pid = -1 means check ANY child; WNOHANG means don't block
        pid_t finished_pid = waitpid(-1, &status, WNOHANG);

        if (finished_pid > 0) {
            printf("[Parent] Child %d finished!\n", finished_pid);
            active_children--;
        } else if (finished_pid == 0) {
            // No child has changed state yet; parent can do other tasks
            printf("[Parent] Working... (Children still running)\n");
            usleep(500000); // Simulate parent doing work for 0.5s
        } else if (finished_pid == -1 && errno != EINTR) {
            break; // Error or no more children to wait for
        }
    }

    printf("Parent: All children are reaped. Mission complete.\n");
    return 0;
}
