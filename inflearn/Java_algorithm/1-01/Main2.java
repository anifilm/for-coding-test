import java.util.Scanner;

public class Main2 {
    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);
        // 향상된 for문 사용
        for (char s : str.toCharArray()) {
            if (s == t) answer++;
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
