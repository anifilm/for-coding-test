import java.util.*;

public class Main {
    public static String solution(int n, String[] arr) {
        String answer = "";
        for (String str : arr) {
            int len = str.length() - 1;
            for (int i = len; i >= 0; i--) {
                answer += str.charAt(i);
            }
            answer += "\n";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println(solution(n, arr));
        sc.close();
    }
}
