import java.util.*;

public class Main2 {
    public static String solution(String str) {
        String answer = "YES";
        // 정규표현식을 사용하여 알파벳 이외의 문자 제거
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String revStr = new StringBuilder(str).reverse().toString();
        // 문자열과 뒤집어진 문자열을 비교
        if (!str.equals(revStr)) answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(solution(input));
    }
}
