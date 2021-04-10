import java.util.*;

public class Main {
    public static String solution(String str, char t) {
        String answer = "";
        int cal, tmp;
        for (int i = 0; i < str.length(); i++) {
            cal = tmp = str.length();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == t) {
                    tmp = Math.abs(i - j);
                    if (cal > tmp) cal = tmp;
                }
            }
            answer += cal + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        System.out.println(solution(s, t));
    }
}
