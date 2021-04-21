import java.util.*;

public class Main2 {
    public static int solution(String str) {
        int answer = 0;
        for (char chr : str.toCharArray()) {
            if (chr >= '0' && chr <= '9')
                answer = answer * 10 + (chr - '0');
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
