package chap08.fibonacci;

public class Fibonacci2 {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    // 8.2.1 메모이제이션
    static int fibonacci(int k) {
        return fibonacci(k, new int[k + 1]);
    }

    static int fibonacci(int k, int[] cache) {
        if (k <= 1) {
            return k;
        } else if (cache[k] > 0) {
            return cache[k];
        }

        cache[k] = fibonacci(k - 2, cache) + fibonacci(k - 1, cache);

        return cache[k];
    }
}
