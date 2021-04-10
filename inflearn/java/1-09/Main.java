import java.util.*;

public class Main {
    public static String solution(String str) {
        String answer = "";
        // 정규표현식을 사용하여 알파벳 문자 제거
        str = str.toLowerCase().replaceAll("[a-z]", "");
        // 정수형 문자열을 정수로 변환 후 문자열로 다시 변환
        answer += Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
    }
}
