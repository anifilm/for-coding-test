import java.util.Scanner

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var a: Int
    var b: Int

    while (true) {
        a = sc.nextInt()
        b = sc.nextInt()
        if (a == 0 && b == 0) break
        println(a + b)
    }
}
