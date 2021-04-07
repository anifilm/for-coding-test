import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if (t >= 'a')  // 아스키 코드로 비교
                answer += Character.toUpperCase(t);
            else
                answer += Character.toLowerCase(t);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        System.out.println(solution(input));
    }
}
