bool solution(int n) {
    while(n > 0 && n%2 == 0) {
        n = (n/2).toInt(); // 묵시적 형변환을 지원하지 않는다.
        // Convert double to int (다음과 같이 int형으로 형 변환 필요)
        // toInt() and truncate()
        // round()
        // ceil()
        // floor()
    }
    return n == 1 ? true : false;
}

main() {
    print(solution(1));
    print(solution(16));
    print(solution(4));
    print(solution(8));
}

