class Main {
    static def solution(str, ch) {
        //int answer = 0
        //for (it in str.toLowerCase().split('')) {
        //    if (it == ch) answer++
        //}
        //return answer

        //int answer = 0
        //str.toLowerCase().split('').each {
        //    if (it == ch) answer++
        //}
        //return answer

        def answer = []
        answer = str.toLowerCase().split('').findAll {
            it == ch
        }
        return answer.size()
    }

    static void main(String[] args) {
        String input1 = System.in.newReader().readLine()
        String input2 = System.in.newReader().readLine()

        println solution(input1, input2)
    }
}
