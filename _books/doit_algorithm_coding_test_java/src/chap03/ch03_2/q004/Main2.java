package chap03.ch03_2.q004;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
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

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()) + 1; // 표의 크기 N
        int M = Integer.parseInt(st.nextToken()); // 구해야 하는 횟수 M

        // 데이터 배열 입력 (2차원)
        int A[][] = new int[N][N];
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 질의 개수 만큼 반복
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken()); int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken()); int y2 = Integer.parseInt(st.nextToken());
            System.out.println(solution(N, A, x1, y1, x2, y2));
        }

        bf.close();
    }
}
