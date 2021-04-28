class Main {
    static def solution(a, b) {
        int answer = a + b
        return answer
    }

    static void main(String[] args) {
        def input = System.in.newReader().readLine().split(' ')
        int a = input[0].toInteger()
        int b = input[1].toInteger()

        println solution(a, b)
    }
}
