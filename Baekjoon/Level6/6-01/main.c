#include <stdio.h>

long long sum(int* a, int n) {
    if (n == 1)
        return a[0];
    else
        return sum(a, n - 1) + a[n - 1];
}

int main() {
    int arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    printf("sum: %lld", sum(arr, 10));
    return 0;
}
