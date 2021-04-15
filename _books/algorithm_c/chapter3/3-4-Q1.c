/* Q1
실습 3-3의 search 함수를 while문이 아니라 for문을 사용하여 수정한 프로그램을 작성하세요.
*/
#include <stdio.h>
#include <stdlib.h>

// 요소의 개수가 n인 배열 a에서 key와 일치하는 요소를 선형 검색 (보초법, 버전2: for문)
int search(int a[], int n, int key) {
    int i;
    a[n] = key;         // 보초를 추가
    for (i = 0; i < n; i++){
        if (a[i] == key)
            break;      // 원하는 키 값을 찾은 경우
    }
    return i == n ? -1 : i;
}

int main() {

    int i, nx, ky, idx;
    int* x;                 // 배열의 첫번째 요소에 대한 포인터

    puts("선형 검색 (보초법)");
    printf("요소 개수: ");
    scanf("%d", &nx);
    x = (int*)calloc(nx + 1, sizeof(int));    // 요소의 개수가 (nx + 1)인 int형 배열을 생성
    for (i = 0; i < nx; i++) {      // 주의: 값을 읽어 들인 것은 nx개
        printf("x[%d]: ", i);
        scanf("%d", &x[i]);
    }
    printf("검색값: ");
    scanf("%d", &ky);

    printf("배열 x의 입력 내용 확인\n");
    printf("{ ");
    for (i = 0; i < nx; i++)
        printf("%d ", x[i]);
    printf("}\n");

    idx = search(x, nx, ky);        // 배열 x의 값이 ky인 요소를 선형 검색
    if (idx == -1)
        puts("해당 값을 찾을 수 없습니다.");
    else
        printf("%d(은)는 x[%d]에 있습니다.\n", ky, idx);
    free(x);        // 배열 해제

    return 0;
}
