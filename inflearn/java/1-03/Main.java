import java.util.*;

public class Main {
    public static String solution(String str) {
        String answer = "";
        int max = 0;
        String[] str_split = str.split(" ");
        for (String s : str_split) {
            int len = s.length();
            if (len > max) {
                max = len;
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 공백 포함한 문자열 입력

        System.out.println(solution(input));
    }
}
