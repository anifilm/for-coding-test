/* Q4
실습 6-3의 버블 정렬(버전3)을 연습문제 Q2와 마찬가지로 비교, 교환 과정을 자세히 출력하는 프로그램으로
수정하세요.
 */
package chap06.section2;
import java.util.Scanner;

public class Q4 {
    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    // 버블 정렬 (버전3, 과정 출력)
    static void bubbleSort(int[] a, int n) {
        int ccnt = 0;  // 비교 횟수
        int scnt = 0;  // 교환 횟수
        int pcnt = 1;  // 패스

        int i = 0;
        while (i < n - 1) {
            System.out.println("패스 " + pcnt++ + ":");
            int last = n - 1;  // 마지막으로 요소를 교환한 위치

            for (int j = n - 1; j > i; j--) {
                for (int k = 0; k < j - 1; k++)
                    System.out.print(a[k] + " ");
                if (a[j - 1] > a[j]) {
                    System.out.print(a[j - 1] + "+" + a[j] + " ");
                    swap(a, j - 1, j);
                    last = j;  // 교환시점을 저장
                    scnt++;
                }
                else
                    System.out.print(a[j - 1] + "-" + a[j] + " ");
                for (int k = j + 1; k < n; k++)
                    System.out.print(a[k] + " ");
                System.out.println();
                ccnt++;
            }
            i = last;  // a[i]보다 앞쪽은 정렬을 마친 상태
        }

        System.out.println("비교를 " + ccnt + "회 했습니다.");
        System.out.println("교환을 " + scnt + "회 했습니다.");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬 (버전3, 과정 출력)");
        System.out.print("요소수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx);  // 배열 x를 버블 정렬합니다.
    }
}
