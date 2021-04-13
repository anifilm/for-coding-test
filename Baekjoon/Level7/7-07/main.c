#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int reverseStringToInt(const char* str, int len) {
    char r_str[len+1];
    for (int i = 0; i < len; i++)
        r_str[i] = str[len-1-i];
    return atoi(r_str);
}

int main() {
    char a[4], b[4];
    scanf("%s %s", a, b);
    int n1, n2;
    n1 = reverseStringToInt(a, strlen(a));
    n2 = reverseStringToInt(b, strlen(b));
    if (n1 > n2)
        printf("%d", n1);
    else
        printf("%d", n2);
    return 0;
}
