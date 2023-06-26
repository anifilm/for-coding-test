package chap03.ch03_1.q002;

import java.util.*;

public class Main {
    public static double solution(int N, int[] A) {
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            sum += A[i];
        }
        return (sum * 100.0 / max / N);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solution(N, A));

        sc.close();
    }
}
