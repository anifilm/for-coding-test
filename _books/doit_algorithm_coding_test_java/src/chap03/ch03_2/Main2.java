package chap03.ch03_2;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static long solution(int N, int[] A, int i, int j) {
        long S[] = new long[N];
        // 합 배열 생성
        for (int s = 1; s < N; s++) {
            S[s] = S[s-1] + A[s];
        }
        return S[j] - S[i-1];
    }

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()) + 1;
        int M = Integer.parseInt(st.nextToken());

        // 데이터 배열 입력
        int A[] = new int[N];
        st = new StringTokenizer(bf.readLine());
        for (int n = 1; n < N; n++) {
            A[n] = Integer.parseInt(st.nextToken());
        }
        // 질의 개수 만큼 반복
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(solution(N, A, i, j));
        }

        bf.close();
    }
}
