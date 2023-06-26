package chap03.ch03_2.q003;

import java.util.*;

public class Main {
    public static long solution(int N, int[] A, int i, int j) {
        long S[] = new long[N];
        // 합 배열 생성
        for (int s = 1; s < N; s++) {
            S[s] = S[s-1] + A[s];
        }
        return S[j] - S[i-1];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // *시간초과, 입력개선 필요

        int N = sc.nextInt() + 1;
        int M = sc.nextInt();
        // 데이터 배열 입력
        int A[] = new int[N];
        for (int n = 1; n < N; n++) {
            A[n] = sc.nextInt();
        }
        // 질의 개수 만큼 반복
        for (int q = 0; q < M; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(solution(N, A, i, j));
        }

        sc.close();
    }
}
