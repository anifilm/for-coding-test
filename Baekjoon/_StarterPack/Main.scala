// vscode 에서 scala 파일명로 실행시 콘솔 입력 내용이 보여지지 않는 문제점이 있다.
// 인텔리J에서 문제 풀이 작성할 것
object Main {
  def solution(num: Int, str: String): String = {
    val answer = "test"
    println(num)
    println(str)
    return answer
  }

  def main(args: Array[String]): Unit = {
    val num = scala.io.StdIn.readInt
    val str = scala.io.StdIn.readLine

    println(solution(num, str))
  }
}
