/* Q6
요소의 값이 내림차순으로 정렬된 long형 배열에서의 검색을 bsearch 함수를 사용하여 프로그램을 작성하세요.
*/
#include <stdio.h>
#include <stdlib.h>

// 정수를 비교하는 함수 (long형 내림차순)
int long_cmpr(const long* a, const long* b) {
    if (*a < *b)
        return 1;
    else if (*a > *b)
        return -1;
    else
        return 0;
}

int main() {

    int i, nx, ky;
    long* x;                 // 배열의 첫번째 요소에 대한 포인터
    long* p;                 // 검색한 요소에 대한 포인터
    puts("bsearch 함수를 사용하여 검색 (내림차순)");
    printf("요소 개수: ");
    scanf("%d", &nx);
    x = (long*)calloc(nx, sizeof(long));    // 요소의 개수가 nx인 long형 배열을 생성
    printf("내림차순으로 입력하세요.\n");
    printf("x[0]: ");
    scanf("%d", &x[0]);
    for (i = 1; i < nx; i++) {
        do {
            printf("x[%d]: ", i);
            scanf("%ld", &x[i]);
            if (x[i] >= x[i - 1])
                printf("%d보다 작은 값을 입력하세요.\n", x[i - 1]);
        } while (x[i] >= x[i - 1]);  // 바로 앞의 값보다 크면 다시 입력하도록 함
    }
    printf("검색값: ");
    scanf("%d", &ky);

    printf("배열 x의 입력 내용 확인\n");
    printf("{ ");
    for (i = 0; i < nx; i++)
        printf("%d ", x[i]);
    printf("}\n");

    p = (long*)bsearch(&ky,                                   // 검색값의 메모리 주소값
                x,                                            // 배열 x
                nx,                                           // 요소의 개수
                sizeof(int),                                  // 요소의 크기
                (int(*)(const void*, const void*))long_cmpr   // 비교 함수
                );

    if (p == NULL)
        puts("해당 값을 찾을 수 없습니다.");
    else
        printf("%d(은)는 x[%d]에 있습니다.\n", ky, (int)(p - x));
    free(x);        // 배열 해제

    return 0;
}
