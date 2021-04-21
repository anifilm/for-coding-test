import java.util.*;

public class Main {
    public static String solution(String str) {
        String answer = "";
        int len = str.length() - 1;
        for (int i = len; i >= 0; i--)
            answer += str.charAt(i);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            System.out.println(solution(input));
        }
        sc.close();
    }
}
