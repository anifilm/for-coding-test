import java.util.*;

public class Main2 {
    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            // 스트링 빌더를 통한 문자열 뒤집기
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
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
