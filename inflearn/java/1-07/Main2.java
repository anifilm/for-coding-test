import java.util.*;

public class Main2 {
    public static String solution(String str) {
        String answer = "YES";
        String revStr = new StringBuilder(str).reverse().toString();
        // 뒤집어진 문자열과 문자열 바로 비교
        if (!str.equalsIgnoreCase(revStr)) answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
    }
}
