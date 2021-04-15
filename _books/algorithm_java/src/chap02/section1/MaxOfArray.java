// 배열 요소의 최대값을 나타냅니다. (값을 입력 받음)
package chap02.section1;
import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수: ");
        int num = stdIn.nextInt();  // 배열의 요소수를 입력 받음

        int[] height = new int[num];  // 요소수가 num인 배열을 생성

        for (int i = 0; i < num; i++) {
            System.out.print("height[" + i + "]: ");
            height[i] = stdIn.nextInt();
        }

        System.out.println("최대값은 " + maxOf(height) + "입니다.");
    }
}
