#include <stdio.h>
#define MAX_STRLEN 1000001

int main() {
    char str[MAX_STRLEN];
    int word_count = 0, word_len = 0;
    fgets(str, sizeof(str), stdin);
    for (int i = 0; str[i] != '\0'; i++) {
        if (word_len > 0 && str[i] == ' ') {
            word_count++;
            word_len = 0;
        } else if (str[i] >= 'A') {
            word_len++;
        }
    }
    if (word_len > 0) {
        word_count++;
    }
    printf("%d", word_count);
    return 0;
}
