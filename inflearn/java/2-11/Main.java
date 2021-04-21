import java.util.*;

public class Main {
    public static int solution(int n, int[][] arr) {
        int answer = 1; // 모든 학생이 다른 반이었다면 1번 학생이 임시반장
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int[] check = new int[n]; // 같은 반이었던 학생이 있었는지 저장
            // n번 학생과 같은 반이었던 학생의 수를 확인
            for (int j = 0; j < 5; j++) { // 학년
                // n번 학생의 반
                int student_class = arr[i][j];
                // 다른 학생의 반과 비교
                for (int k = 0; k < n; k++) { // 학생
                    if (i == k) continue; // 비교 학생과 같은 사람이라면 건너뛴다.
                    if (student_class == arr[k][j] && check[k] == 0) {
                        check[k] = 1;
                        count++;
                    }
                }
            }
            //System.out.println((i+1)+"번 학생과 같은 반이었던 학생수는 " + count);
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
