def solution(a, b, c) {
    String answer = ''
    answer += ((a + b) % c) + "\n"
    answer += (((a % c) + (b % c)) % c) + "\n"
    answer += ((a * b) % c) + "\n"
    answer += (((a % c) * (b % b)) % b) + "\n"
    return answer
}

String[] input = System.in.newReader().readLine().split(' ')
int a = input[0].toInteger()
int b = input[1].toInteger()
int c = input[2].toInteger()

println solution(a, b, c)
