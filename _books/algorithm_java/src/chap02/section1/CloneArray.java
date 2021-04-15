// 배열을 복제합니다.
package chap02.section1;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();  // b는 a의 복제를 참조

        b[3] = 0;  // 한 요소에만 0을 대입

        System.out.print("a = ");
        for (int i = 0; i < a.length; i++)
            System.out.print(" " + a[i]);
        System.out.println();

        System.out.print("b = ");
        for (int i = 0; i < b.length; i++)
            System.out.print(" " + b[i]);
        System.out.println();
    }
}
