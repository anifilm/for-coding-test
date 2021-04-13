#include <stdio.h>

int checkNum(int n) {
    int i, k, t, a[3], han;
    for (i = 1; i <= n; i++) {
        if (i < 100)
            han = i;
        else if (i == 1000)
            break;
        else {
            k = 0; t = i;
            while (t > 0) {
                a[k] = t % 10;
                t /= 10; k++;
            }
            if (a[0] - a[1] == a[1] - a[2]) han++;
        }
    }
    return han;
}

int main() {
    int n, count; scanf("%d", &n);
    count = checkNum(n);
    printf("%d", count);
    return 0;
}
