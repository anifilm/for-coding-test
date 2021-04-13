#include <stdio.h>
#include <string.h>

int countCroatiaAlphabet(const char* str, int len) {
    int count = 0;
    for (int i = 0; i < len; i++) {
        if (str[i] == 'c' && str[i+1] == '=') {
            count++; i++;
        }
        else if (str[i] == 'c' && str[i+1] == '-') {
            count++; i++;
        }
        else if (str[i] == 'd' && str[i+1] == 'z' && str[i+2] == '=') {
            count++; i += 2;
        }
        else if (str[i] == 'd' && str[i+1] == '-') {
            count++; i++;
        }
        else if (str[i] == 'l' && str[i+1] == 'j') {
            count++; i++;
        }
        else if (str[i] == 'n' && str[i+1] == 'j') {
            count++; i++;
        }
        else if (str[i] == 's' && str[i+1] == '=') {
            count++; i++;
        }
        else if (str[i] == 'z' && str[i+1] == '=') {
            count++; i++;
        }
        else
            count++;
    }
    return count;
}

int main() {
    char str[101];
    scanf("%s", str);
    int count = countCroatiaAlphabet(str, strlen(str));
    printf("%d", count);
    return 0;
}
