bool solution(int n) {
    while(n > 0 && n%2 == 0) {
        n ~/= 2; // ~/ (정수형 나눗셈)
    }
    return n == 1 ? true : false;
}

main() {
    print(solution(1));
    print(solution(16));
    print(solution(4));
    print(solution(8));
}

