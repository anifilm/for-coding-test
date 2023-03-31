package chap03.ch03_1;

import java.util.*;

public class Main {
    public static int solution(int N, char[] cNum) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += cNum[i] - '0';
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        System.out.println(solution(N, cNum));

        sc.close();
    }
}
