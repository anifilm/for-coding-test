class Main {
    static def solution(a, b) {
        String answer = ''
        answer += (a + b) + "\n"
        answer += (a - b) + "\n"
        answer += (a * b) + "\n"
        answer += (a / b).toInteger() + "\n"
        answer += (a % b) + "\n"
        return answer
    }

    static void main(String[] args) {
        def input = System.in.newReader().readLine().split(' ')
        int a = input[0].toInteger()
        int b = input[1].toInteger()

        println solution(a, b)
    }
}
