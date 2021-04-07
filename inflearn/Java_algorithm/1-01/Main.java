import java.util.Scanner;

public class Main {
    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);
        int str_len = str.length();
        for (int i = 0; i < str_len; i++) {
            if (str.charAt(i) == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);

        System.out.println(solution(input1, input2));
    }
}
