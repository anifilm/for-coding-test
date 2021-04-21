import java.util.*;

public class Main2 {
    public static String solution(int n, String str) {
        String answer = "";
        String binaryString = "";
        for (int i = 0; i < n; i++) {
            // 문자열을 0부터 7이전까지 자른다. (자른 문자열의 #은 1로 *은 0으로 바꾼다.)
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            // 자른 이후 문자를 다시 str에 저장
            str = str.substring(7);
            // 2진수 문자열을 십진수로 변환 한 뒤 문자로 형 변환하여 저장
            answer += (char)Integer.parseInt(tmp, 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

        System.out.println(solution(n, input));
        sc.close();
    }
}
