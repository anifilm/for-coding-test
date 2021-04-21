import java.util.*;

public class Main3 {
    public static int solution(String str) {
        String answer = "";
        for (char chr : str.toCharArray()) {
            if (Character.isDigit(chr))
                answer += chr;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
        sc.close();
    }
}
