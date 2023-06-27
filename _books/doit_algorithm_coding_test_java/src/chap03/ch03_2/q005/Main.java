package chap03.ch03_2.q005;

import java.util.*;

public class Main {
    public static long solution(int N, int[] A, int M) {
        long answer = 0;
        long S[] = new long[N];
        // 합 배열 생성
        S[0] = A[0];
        for (int s = 1; s < N; s++) {
            S[s] = S[s-1] + A[s];
        }
        // 합 배열에 대한 나누기 연산
        long C[] = new long[M];
        for (int i = 0; i < N; i++) {
            int remainder = (int)(S[i] % M);
            if (remainder == 0) answer++;
            C[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer = answer + (C[i] * (C[i]-1) / 2);
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        // 데이터 배열 입력
        int A[] = new int[N];
        for (int n = 0; n < N; n++) {
            A[n] = sc.nextInt();
        }
        System.out.println(solution(N, A, M));

        sc.close();
    }
}
