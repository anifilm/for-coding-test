import java.util.*;

public class Main3 {
    public static String solution(String str) {
        String answer = "";
        for (char s : str.toCharArray()) {
            if (Character.isLowerCase(s))
                answer += Character.toUpperCase(s);
            else
                answer += Character.toLowerCase(s);
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
