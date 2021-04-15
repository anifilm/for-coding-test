// 1, 2, ..., n의 합을 구합니다.
package chap01.section2;
import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = stdIn.nextInt();

        int sum = 0;    // 합
        int i = 1;

        while (i <= n) {    // i가 n이하면 반복합니다.
            sum += i;       // sum에 i를 더합니다.
            i++;            // i 값을 1만큼 증가시킵니다.
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
