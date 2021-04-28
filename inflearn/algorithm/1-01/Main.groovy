def solution1(str, ch) {
    int answer = 0
    for (it in str.toLowerCase().split('')) {
       if (it == ch) answer++
    }
    return answer
}

def solution2(str, ch) {
    int answer = 0
    str.toLowerCase().split('').each {
       if (it == ch) answer++
    }
    return answer

def solution3(str, ch) {
    def answer = []
    answer = str.toLowerCase().split('').findAll {
        it == ch
    }
    return answer.size()
}

String input1 = System.in.newReader().readLine()
String input2 = System.in.newReader().readLine()

println solution3(input1, input2)
