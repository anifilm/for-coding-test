import java.util.*;

public class Main {
    public static String solution(String str) {
        char[] answer = str.toCharArray(); // 문자열을 char 배열로 변환
        int lt = 0, rt = answer.length - 1;
        while (lt < rt) {
            char t1 = answer[lt];
            char t2 = answer[rt];
            if (!Character.isAlphabetic(t1))
                lt++;
            else if (!Character.isAlphabetic(t2))
                rt--;
            else {
                answer[lt] = t2;
                answer[rt] = t1;
                lt++;
                rt--;
            }
        }
        return String.valueOf(answer); // char 배열을 문자열로 변환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}

