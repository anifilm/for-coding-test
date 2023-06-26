package chap03.ch03_2.q004;

import java.util.*;

public class Main {
    public static long solution(int N, int[][] A, int x1, int y1, int x2, int y2) {
        long S[][] = new long[N][N];
        // 합 배열 생성
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + A[i][j];
            }
        }
        return S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // *시간초과, 입력개선 필요

        int N = sc.nextInt() + 1; // 표의 크기 N
        int M = sc.nextInt(); // 구해야 하는 횟수 M
        // 데이터 배열 입력 (2차원)
        int A[][] = new int[N][N];
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        // 질의 개수 만큼 반복
        for (int q = 0; q < M; q++) {
            int x1 = sc.nextInt(); int y1 = sc.nextInt();
            int x2 = sc.nextInt(); int y2 = sc.nextInt();
            System.out.println(solution(N, A, x1, y1, x2, y2));
        }

        sc.close();
    }
}
