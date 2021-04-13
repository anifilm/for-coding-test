#include <stdio.h>
#include <string.h>

int main() {
    int test_case;
    scanf("%d", &test_case);
    int repeat[test_case];
    char str[test_case][21];
    for (int t = 0; t < test_case; t++) {
        scanf("%d %s", &repeat[t], str[t]);
    }
    for (int t = 0; t < test_case; t++) {
        for (size_t i = 0; i < strlen(str[t]); i++) {
            for (int r = 0; r < repeat[t]; r++)
                printf("%c", str[t][i]);
        }
        printf("\n");
    }
    return 0;
}
