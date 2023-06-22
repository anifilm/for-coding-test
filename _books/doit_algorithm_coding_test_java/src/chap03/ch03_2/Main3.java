package chap03.ch03_2;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()) + 1;
        int M = Integer.parseInt(st.nextToken());

        // 합 배열 생성
        long S[] = new long[N];
        st = new StringTokenizer(bf.readLine());
        for (int s = 1; s < N; s++) {
            S[s] = S[s-1] + Integer.parseInt(st.nextToken());
        }

        // 질의 개수 만큼 반복
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }

        bf.close();
    }
}
