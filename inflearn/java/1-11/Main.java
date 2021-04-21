import java.util.*;

public class Main {
    public static String solution(String str) {
        String answer = "";
        str += " ";
        int count = 1;
        for (int i = 0; str.charAt(i) != ' '; i++) {
            char tmp = str.charAt(i);
            if (tmp != str.charAt(i + 1)) {
                answer += tmp;
                if (count > 1) answer += count;
                count = 1;
            }
            else count++;
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
