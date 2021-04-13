#include <stdio.h>
#include <string.h>

int groupwordChecker(const char* str, int len) {
    int i, j, is_groupword = 1;
    for (i = 0; i < len; i++) {
        for (j = i + 1; j < len; j++) {
            if (str[i] == str[i+1])
                continue;
            if (str[i] == str[j])
                if (j - i > 1) is_groupword = 0;
        }
    }
    return is_groupword;
}

int main() {
    int n, count = 0, i = 0;
    scanf("%d", &n);
    while (i < n) {
        char str[101];
        scanf("%s", str);
        if (groupwordChecker(str, strlen(str)) == 1)
            count++;
        i++;
    }
    printf("%d", count);
    return 0;
}
