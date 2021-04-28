def solution(a, b) {
    String answer = ''
    answer += (a + b) + '\n'
    answer += (a - b) + '\n'
    answer += (a * b) + '\n'
    answer += (a.intdiv(b)) + '\n' // 정수형 나눗셈
    answer += (a % b) + '\n'
    return answer
}

String[] input = System.in.newReader().readLine().split(' ')
int a = input[0].toInteger()
int b = input[1].toInteger()

println solution(a, b)
