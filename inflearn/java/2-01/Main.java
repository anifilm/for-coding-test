import java.util.*;

public class Main {
    public static String solution(int n, String str) {
        String answer = str.charAt(0) + " ";
        String[] arr = str.split(" ");
        for (int i = 1; i < n; i++) {
            int a = Integer.parseInt(arr[i - 1]);
            int b = Integer.parseInt(arr[i]);
            if (a < b)
                answer += b + " ";
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
