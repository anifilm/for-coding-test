import java.util.*;

public class Main {
    public static int solution(int n, int[][] arr) {
        int answer = 0;
        // 가로행,세로열 계산
        int sum_r, sum_c;
        for (int i = 0; i < n; i++) {
            sum_r = sum_c = 0;
            for (int j = 0; j < n; j++) {
                sum_r += arr[i][j];
                sum_c += arr[j][i];
            }
            if (answer < sum_r) answer = sum_r;
            if (answer < sum_c) answer = sum_c;
        }
        // 대각선 계산
        int sum_c1 = 0, sum_c2=0;
        for (int i = 0; i < n; i++) {
            sum_c1 += arr[i][i];
            sum_c2 += arr[n-1-i][i];
        }
        if (answer < sum_c1) answer = sum_c1;
        if (answer < sum_c2) answer = sum_c2;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            // 입력받은 문자열을 정수형 배열로 변경
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        System.out.println(solution(n, arr));
        sc.close();
    }
}
