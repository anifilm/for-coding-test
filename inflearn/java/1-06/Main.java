import java.util.*;

public class Main {
    public static String solution(String str) {
        ArrayList<Character> answer = new ArrayList<>();
        for (char s : str.toCharArray()) {
            if (!answer.contains(s)) answer.add(s);
        }
        // ArrayList의 요소를 문자열로 변경
        return answer.toString().replaceAll("[,\\s\\[\\]]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
        sc.close();
    }
}
