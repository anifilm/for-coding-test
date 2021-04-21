import java.util.*;

public class Main {
    public static String solution(String str) {
        String answer = "YES";
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(len - 1 - i)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
        sc.close();
    }
}
