import java.util.*;

public class Main {
    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int check, check_u, check_d, check_l, check_r;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                check = arr[i][j];
                if (i == 0) check_u = 0;
                else check_u = arr[i-1][j];
                if (i == n - 1) check_d = 0;
                else check_d = arr[i+1][j];
                if (j == 0) check_l = 0;
                else check_l = arr[i][j-1];
                if (j == n - 1) check_r = 0;
                else check_r = arr[i][j+1];
                if (check > check_u && check > check_d && check > check_l && check > check_r) {
                    answer++;
                }
            }
        }
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
    }
}
