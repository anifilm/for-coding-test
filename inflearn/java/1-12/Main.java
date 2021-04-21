import java.util.*;

public class Main {
    public static String solution(int n, String str) {
        String answer = "";
        String binaryString = "";
        int len = n * 7;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '#')
                binaryString += "1";
            else
                binaryString += "0";
            count++;
            if (count == 7) {
                answer += (char)Integer.parseInt(binaryString, 2);
                binaryString = "";
                count = 0;
            }
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
