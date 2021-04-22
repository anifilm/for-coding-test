import java.util.*;

public class Main {
    public static String solution(String str) {
        List<Character> answer = new ArrayList<>();
        for (char s : str.toCharArray()) {
            if (!answer.contains(s)) answer.add(s);
        }
        // ArrayList<Character>의 요소를 문자열로 변경 (공백 없음)
        return answer.toString().replaceAll("\\[|, |\\]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
        sc.close();
    }
}
