#include <stdio.h>

int main() {
    int n, count, numThree = 0;
    scanf("%d", &n);
    while (n % 5 != 0 && n >= 0) {
        n -= 3;
        numThree++;
    }
    count = n < 0 ? -1 : numThree + n/5;
    printf("%d", count);
    return 0;
}
