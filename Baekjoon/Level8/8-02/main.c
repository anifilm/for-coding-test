#include <stdio.h>

int main() {
    long long n;
    scanf("%lld", &n);
    int count = 1;
    long long range = 1;
    long long tmp = 1;
    while (1) {
        if (range >= n) break;
        tmp = 6 * (count++);
        range += tmp;
    }
    printf("%d", count);
    return 0;
}
