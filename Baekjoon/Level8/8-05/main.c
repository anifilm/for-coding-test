#include <stdio.h>

int main() {
    int h, w, n;
    int t;
    scanf("%d", &t);
    while(t--) {
        scanf("%d %d %d", &h, &w, &n);
        printf("%d%02d\n", (n-1) % h+1, (n-1) / h+1);
    }
    return 0;
}
