import java.util.*;

public class Main {
    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        char input2 = sc.next().charAt(0);

        System.out.println(solution(input1, input2));
    }
}
