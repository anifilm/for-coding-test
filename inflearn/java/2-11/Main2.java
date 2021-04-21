import java.util.*;

public class Main2 {
    public static int solution(int n, int[][] arr) {
        int answer = 1; // 모든 학생이 다른 반이었다면 1번 학생이 임시반장
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            // n번 학생과 같은 반이었던 학생의 수를 확인
            for (int j = 0; j < n; j++) { // 학생
                for (int k = 0; k < 5; k++) { // 학년
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println((i+1)+"번 학생과 같은 반이었던 학생수는 " + count);
            if (max_count < count) {
                max_count = count;
                answer = i + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            // 입력받은 문자열을 정수형 배열로 변경
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        System.out.println(solution(n, arr));
        sc.close();
    }
}
