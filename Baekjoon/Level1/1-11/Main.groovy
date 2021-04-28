class Main {
    static def solution(a, b) {
        String answer = ''

        int n, b1, b2, b3
        n = b
        b1 = n % 10 // 일의 자리수
        n /= 10
        b2 = n % 10 // 십의 자리수
        n /= 10
        b3 = n % 10 // 백의 자리수

        answer += (a * b1) + "\n"
        answer += (a * b2) + "\n"
        answer += (a * b3) + "\n"
        answer += (a * b) + "\n"
        return answer
    }

    static void main(String[] args) {
        int input1 = System.in.newReader().readLine() as Integer
        int input2 = System.in.newReader().readLine() as Integer

        println solution(input1, input2)
    }
}
