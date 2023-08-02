// 배열에 데이터 삽입
#include <stdio.h>

char Data[5] = {'A', 'B', 'D', 'E'};
char c;

int main() {

    int i, temp, temp2;
    c = 'C';

    for (i = 0; i < 5; i++) {
        printf("%2c", Data[i]);
    }
    printf("\n");

    for (i = 0; i < 5; i++) { // c 보다 큰 값을 찾음
        if (Data[i] > c) break;
    }

    temp = Data[i]; // 해당 인덱스의 값 'D'를 temp에 저장
    Data[i] = c; // 해당 인덱스에 c값을 삽입
    i++;

    for ( ; i < 5; i++) { // 'D', 'E'를 한칸씩 뒤로 이동시킴
        temp2 = Data[i];
        Data[i] = temp;
        temp = temp2;
    }

    for (i = 0; i < 5; i++) {
        printf("%2c", Data[i]);
    }
    printf("\n");

    return 0;
}
