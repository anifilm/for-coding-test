/* Q7
실습 1-5 프로그램을 참고하여 n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'로 출력하는
프로그램을 작성하세요.
 */
package chap01.section2;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = stdIn.nextInt();

        int sum = 0;    // 합

        for (int i = 1; i <= n; i++) {  // i = 1, 2, ..., n
            sum += i;   // sum에 i를 더합니다.

            if (n == 7)
                if (i < 7)
                    System.out.print(i + " + ");
                else
                    System.out.print(i);
        }

        if (n == 7)
            System.out.println(" = " + sum);
        else
            System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
