import java.util.*;

public class Main {
    public static int solution(int n, String str) {
        String[] arr = str.split(" ");
        int answer = 1;
        int a = Integer.parseInt(arr[0]);
        for (int i = 1; i < n; i++) {
            int b = Integer.parseInt(arr[i]);
            if (a < b) {
                a = b;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 클리어
        String input = sc.nextLine();

        System.out.println(solution(n, input));
    }
}
