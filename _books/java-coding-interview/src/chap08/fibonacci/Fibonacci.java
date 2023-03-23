package chap08.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    // 8.1 재귀의 개요
    static int fibonacci(int k) {
        // 종료 조건
        if (k <= 1) {
            return k;
        }

        // 재귀 호출
        return fibonacci(k - 2) + fibonacci(k - 1);
    }
}
