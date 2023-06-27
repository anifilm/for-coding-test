package chap03.ch03_2.q005;

import java.util.*;

public class Main2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long S[] = new long[N];
        long C[] = new long[M];
        long answer = 0;
        // 합 배열 생성
        S[0] = sc.nextInt();
        for (int s = 1; s < N; s++) {
            S[s] = S[s-1] + sc.nextInt();
        }
        // 합 배열에 대한 나누기 연산
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

        System.out.println(answer);

        sc.close();
    }
}
