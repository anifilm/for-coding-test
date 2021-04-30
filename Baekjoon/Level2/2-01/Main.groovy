def solution(a, b) {
    String answer = ''
    if (a < b) {
        answer = '<'
    } else if (a > b) {
        answer = '>'
    } else {
        answer = '=='
    }
    return answer
}

String[] input = System.in.newReader().readLine().split(' ')
int a = input[0].toInteger()
int b = input[1].toInteger()

println solution(a, b)
