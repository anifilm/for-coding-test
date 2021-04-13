#include <stdio.h>

int main() {
    int i, count, a, b;
    scanf("%d", &count);
    for (i = 0; i < count; i++) {
        scanf("%d %d", &a, &b);
        printf("%d\n", a + b);
    }
    return 0;
}
