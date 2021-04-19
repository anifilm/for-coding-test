import java.util.*;

public class Main {
    public static int solution(int n, String[] arr) {
        int answer = 0;
        int score = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("1")) {
                score++;
            } else {
                score = 0;
            }
            answer += score;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] input = sc.nextLine().split(" ");

        System.out.println(solution(n, input));
    }
}
