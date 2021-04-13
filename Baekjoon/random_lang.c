// 랜덤으로 프로그램 언어를 선택해주는 프로그램
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef enum language {
    Clang = 1,
    Cpp,
    CS,
    Python,
    Ruby,
    Go,
    Java,
    Kotlin,
    JavaScript,
    PHP,
    Rust,
    Swift,
    Dart
} Language;

void SelLanguage(int lang) {
    switch(lang) {
        case Clang:
            puts("c언어를 선택하였습니다."); return;
        case Cpp:
            puts("c++를 선택하였습니다."); return;
        case CS:
            puts("c#을 선택하였습니다."); return;
        case Python:
            puts("Python을 선택하였습니다."); return;
        case Go:
            puts("go 언어를 선택하였습니다."); return;
        case Java:
            puts("Java를 선택하였습니다."); return;
        case Kotlin:
            puts("Kotlin을 선택하였습니다."); return;
        case JavaScript:
            puts("JavaScript를 선택하였습니다."); return;
        case PHP:
            puts("PHP를 선택하였습니다."); return;
        case Rust:
            puts("Rust를 선택하였습니다."); return;
        case Swift:
            puts("Swift를 선택하였습니다."); return;
        case Dart:
            puts("Dart를 선택하였습니다."); return;
    }
    puts("숫자가 초과 되었습니다. 다시 선택하세요!"); return;
}

int main() {

    srand(time(NULL));

    int sel = 1 + rand() % 10;

    printf("%d번! ", sel);
    SelLanguage(sel);

    return 0;
}
