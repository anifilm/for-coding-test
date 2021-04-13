#include <stdio.h>
#define MAX_STRLEN 1000001

int main() {
    char str[MAX_STRLEN];
    int i, alphabet[26] = {0,};
    fgets(str, sizeof(str), stdin);
    for (i = 0; str[i] != '\0'; i++) {
        if (str[i] >= 'a' && str[i] <= 'z')
            str[i] = str[i] - 32;   // 대문자로 변경
        alphabet[str[i]-65]++;
    }
    int max = 0; char max_alpha = 0;
    for (i = 0; i < 26; i++) {
        if (alphabet[i] > max) {
            max = alphabet[i];
            max_alpha = i;
        }
        else if (max == alphabet[i])
            max_alpha = '?';
    }
    if (max_alpha == '?')
        printf("%c", max_alpha);
    else
        printf("%c", max_alpha + 65);
    return 0;
}
