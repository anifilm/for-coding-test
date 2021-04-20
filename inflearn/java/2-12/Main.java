import java.util.*;

public class Main {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        // 체크할 배열 생성
        int[][] check = new int[n+1][n+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (i == j) continue;
                check[i][j] = j;
            }
        }
        // 시험결과 검사
        for (int i = 0; i < m; i++) { // 테스트 횟수
            int r = 1;
            for (int j = n-1; j >= 0; j--) { // 학생 순위 체크
                int a = arr[i][j]; // 검토 대상 학생
                for (int k = n-1-r; k >= 0; k--) {
                    int b = arr[i][k]; // 삭제 대상
                    check[a][b] = 0;
                }
                r++;
            }
        }
        // 검토 확인
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (check[i][j] != 0) answer++;
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
