// 종료 조선을 수정한 1에서 n까지의 정수의 합을 구하는 함수
#include <stdio.h>

int sum(int n) {
    // 첫 번째 종료 조건
    if (n <= 0)
        return 0;
    // 두 번째 종료 조건
    if (n == 1)
        return 1;
    return n + sum(n - 1);
}

int main() {

    int x;

    printf("숫자를 하나 입력하세요: ");
    scanf("%d", &x);

    printf("1에서 %d까지의 합: %d\n", x, sum(x));

    return 0;
}
