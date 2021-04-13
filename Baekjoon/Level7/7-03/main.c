#include <stdio.h>
#include <string.h>

int main() {
    char str[100], alphabet[26];
    for (int i = 0; i < 26; i++) alphabet[i] = -1;
    scanf("%s", str);
    for (size_t i = 0; i < strlen(str); i++) {
        if (alphabet[str[i]-97] == -1)
            alphabet[str[i]-97] = i;
    }
    for (int i = 0; i < 26; i++)
        printf("%d ", alphabet[i]);
    return 0;
}
