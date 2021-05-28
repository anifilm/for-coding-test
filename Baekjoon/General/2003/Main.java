import java.util.*;

public class Main {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int result = 0, lt = 0, rt = 0;
        while (lt <= rt) {
            if (result >= m) result -= arr[lt++];
            else if (rt == n) break;
            else result += arr[rt++];
            if (result == m) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);

        String[] input2 = sc.nextLine().split(" ");
        int[] arr = new int[n];
        // 입력받은 문자열을 정수형 배열로 변경
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(solution(n, m, arr));
        sc.close();
    }
}
