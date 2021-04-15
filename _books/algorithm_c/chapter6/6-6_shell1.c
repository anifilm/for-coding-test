// 셀 정렬
#include <stdio.h>
#include <stdlib.h>

// 셀 정렬 함수
void shell(int a[], int n) {
    int i, j, h;
    // 1. 4-정렬 → 2-정렬 ... 순으로 진행
    for (h = n / 2; h > 0; h /= 2) {
        // 2. 단순 삽입 정렬을 수행
        for (i = h; i < n; i++) {
            int tmp = a[i];
            for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                a[j + h] = a[j];
            a[j + h] = tmp;
        }
    }
}

int main() {

    int i, nx;
    int* x;         // 배열의 첫번째 요소에 대한 포인터

    puts("셀 정렬");
    printf("요소 개수: ");
    scanf("%d", &nx);
    x = (int*)calloc(nx, sizeof(int));    // 요소의 개수가 nx인 int형 배열을 생성

    for (i = 0; i < nx; i++) {
        printf("x[%d]: ", i);
        scanf("%d", &x[i]);
    }

    shell(x, nx);  // 배열 x를 셀 정렬

    printf("\n오름차순으로 정렬했습니다.\n");
    for (i = 0; i < nx; i++)
        printf("x[%d] = %d\n", i, x[i]);

    free(x);        // 배열 해제
    return 0;
}
