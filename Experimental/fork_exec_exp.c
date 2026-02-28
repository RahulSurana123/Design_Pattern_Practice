#define _GNU_SOURCE  // Required for execvpe
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    // 1. Define different commands and their arguments
    char *commands[][3] = {
        {"ls", "-lh", NULL},
        {"date", "+%T", NULL},
        {"whoami", NULL, NULL},
        {"pwd", NULL, NULL},
        {"env", NULL, NULL} // This will show our custom environment variable
    };

    int num_children = 5;

    for (int i = 0; i < num_children; i++) {
        pid_t pid = fork();

        if (pid < 0) {
            perror("fork failed");
            exit(1);
        }

        if (pid == 0) {
            // --- CHILD PROCESS ---
            
            // 2. Define a custom environment for this specific child
            char env_str[50];
            sprintf(env_str, "MY_APP_ID=ChildProcess_%d", i + 1);
            char *custom_env[] = {env_str, "PATH=/bin:/usr/bin", NULL};

            printf("\n[Child %d] Running: %s\n", i + 1, commands[i][0]);

            // 3. Use execvpe: (file, argv_array, envp_array)
            // It searches PATH for the command and applies custom_env
            execvpe(commands[i][0], commands[i], custom_env);

            // This part only runs if execvpe fails
            perror("execvpe failed");
            exit(1);
        }
    }

    // --- PARENT PROCESS ---
    // Wait for all 5 children to finish to avoid "zombie" processes
    for (int i = 0; i < num_children; i++) {
        pid_t child_pid = wait(NULL);
        printf("Parent: Child with PID %d has finished.\n", child_pid);
    }

    printf("\nParent: All children have finished.\n");
    return 0;
}
