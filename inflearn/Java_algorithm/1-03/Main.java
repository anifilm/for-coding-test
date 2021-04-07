import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solution(input));
    }
}
