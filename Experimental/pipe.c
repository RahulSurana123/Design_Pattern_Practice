#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

void pipeCommand(char** cmd1, char** cmd2) {
    int fds[2]; // file descriptors for the pipe
    pid_t pid1, pid2;

    if (pipe(fds) == -1) {
        perror("pipe failed");
        exit(EXIT_FAILURE);
    }

    if ((pid1 = fork()) == -1) { // Fork the first child
        perror("fork failed");
        exit(EXIT_FAILURE);
    }

    if (pid1 == 0) {
        // Child 1 process (writes to pipe)
        dup2(fds[1], STDOUT_FILENO); // Redirect stdout to pipe's write end
        close(fds[0]); // Close read end
        close(fds[1]); // Close original write end
        execvp(cmd1[0], cmd1); // Execute command 1
        perror("execvp failed"); // Only reached if exec fails
        exit(EXIT_FAILURE);
    } else {
        // Parent process
        if ((pid2 = fork()) == -1) { // Fork the second child
            perror("fork failed");
            exit(EXIT_FAILURE);
        }

        if (pid2 == 0) {
            // Child 2 process (reads from pipe)
            dup2(fds[0], STDIN_FILENO); // Redirect stdin to pipe's read end
            close(fds[1]); // Close write end
            close(fds[0]); // Close original read end
            execvp(cmd2[0], cmd2); // Execute command 2
            perror("execvp failed"); // Only reached if exec fails
            exit(EXIT_FAILURE);
        }
    }

    // Parent process (main shell)
    close(fds[0]); // Close both pipe ends in parent
    close(fds[1]);
    waitpid(pid1, NULL, 0); // Wait for both children
    waitpid(pid2, NULL, 0);
}


void main() {
    char* cmd1[] = {"ls", "-l", NULL};
    char* cmd2[] = {"wc", "-l", NULL};
    pipeCommand(cmd1, cmd2);
}