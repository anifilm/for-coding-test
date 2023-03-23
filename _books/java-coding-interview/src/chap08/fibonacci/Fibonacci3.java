package chap08.fibonacci;

public class Fibonacci3 {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    // 8.2.2 태뷸레이션
    static int fibonacci(int k) {
        if (k <= 1) {
            return k;
        }

        int first = 1;
        int second = 0;
        int result = 0;

        for (int i = 1; i < k; i++) {
            result = first + second;
            second = first;
            first = result;
        }

        return result;
    }
}
