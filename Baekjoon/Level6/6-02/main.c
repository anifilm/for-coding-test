#include <stdio.h>
#define N 10001     // arr[1...10000]

// 생성자가 없는 수를 판단
int selfNum(int n) {
    int sum = n;
    while (1) {
        if (n == 0) break;
        sum += n % 10;
        n = n / 10;
    }
    return sum;
}

int main() {
    int i, arr[N] = {0,};
    for (i = 1; i < N; i++) {
        int idx = selfNum(i);
        if (idx < N) {
            arr[idx] = 1;
        }
    }
    for (i = 1; i < N; i++)
        if (!arr[i]) printf("%d\n", i);
    return 0;
}
