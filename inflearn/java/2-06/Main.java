import java.util.*;

public class Main {
    public static boolean isPrime(int num) {
        if (num == 1) return false; // 1은 소수에서 제외
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String solution(int n, String[] arr) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(arr[i]);
            String revStr = sb.reverse().toString();
            int checkNum = Integer.parseInt(revStr);
            if (isPrime(checkNum)) {
                answer += checkNum + " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] input = sc.nextLine().split(" ");

        System.out.println(solution(n, input));
        sc.close();
    }
}
