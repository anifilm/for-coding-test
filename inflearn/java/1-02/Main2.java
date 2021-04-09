import java.util.*;

public class Main2 {
    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if (Character.isLowerCase(t))  // 문자가 소문자인지
                answer += Character.toUpperCase(t);
            else
                answer += Character.toLowerCase(t);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
