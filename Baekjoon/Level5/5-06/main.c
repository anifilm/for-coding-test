#include <stdio.h>
#include <string.h>

int main() {
    char ch, str[80];
    int i, n, count = 0, score, total;

    scanf("%d", &n); getchar();
    while (count < n) {
        i = 0, score = 0, total = 0;
        while ((ch = getchar()) != '\n') {
            str[i] = ch;
            i++;
        }
        str[i] = 0;

        for (i = 0; i < strlen(str); i++) {
            if (str[i] == 'O') {
                score += 1;
            } else
                score = 0;
            total += score;
        }
        printf("%d\n", total);
        count++;
    }

    return 0;
}
