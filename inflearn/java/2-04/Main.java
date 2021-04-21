import java.util.*;

public class Main {
    public static String solution(int n) {
        int[] answer = new int[n];
        answer[0] = answer[1] = 1;
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            sum = answer[i - 1] + answer[i];
            answer[i + 1] = sum;
        }
        // int형 배열을 문자열(공백 구분)로 변환
        return Arrays.toString(answer).replaceAll("[^0-9 ]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
        sc.close();
    }
}
