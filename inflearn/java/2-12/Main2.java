import java.util.*;

public class Main2 {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i+1) pi = s;
                        if (arr[k][s] == j+1) pj = s;
                    }
                    if (pi < pj) count++;
                }
                if (count == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] input2 = sc.nextLine().split(" ");
            // 입력받은 문자열을 정수형 배열로 변경
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(input2[j]);
            }
        }

        System.out.println(solution(n, m, arr));
    }
}
