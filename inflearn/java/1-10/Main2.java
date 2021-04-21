import java.util.*;

public class Main2 {
    public static int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int len = str.length();
        int p = 1000;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }
            else
                answer[i] = ++p;
        }
        p = 1000;
        for (int i = len - 1; i >= 0; i--) {
            if (str.charAt(i) == t)
                p = 0;
            else
                answer[i] = Math.min(answer[i], ++p);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        for (int i : solution(s, t)) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
