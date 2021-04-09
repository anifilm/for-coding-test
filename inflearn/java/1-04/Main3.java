import java.util.*;

public class Main3 {
    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray(); // 문자열을 char 배열로 변환
            int len = s.length;
            for (int i = 0; i < len / 2; i++) {
                char tmp = s[i];
                s[i] = s[len - 1 - i];
                s[len - 1 - i] = tmp;
            }
            answer.add(String.valueOf(s)); // char 배열을 문자열로 변환 후 ArrayList에 추가
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++)
            str[i] = sc.next();

        for (String result : solution(n, str)) {
            System.out.println(result);
        }
    }
}
