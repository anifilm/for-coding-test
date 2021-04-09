import java.util.Scanner;

public class Main2 {
    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        // split을 사용하지 않는 다른 방법
        while ((pos = str.indexOf(' ')) != -1) { // 공백의 위치를 찾아 pos로 반환
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1); // 공백 이후 문자열을 저장
        }
        // 마지막 단어를 확인
        if (str.length() > max) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solution(input));
    }
}
