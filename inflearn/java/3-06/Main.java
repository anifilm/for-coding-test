import java.util.*;

public class Main {
    public static int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, rt, lt = 0;
        for (rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            if (cnt > k) {
                if (answer < rt - lt) answer = rt - lt;
            }
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
        }
        if (answer < rt - lt) answer = rt - lt;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);

        String[] input2 = sc.nextLine().split(" ");
        int[] arr = new int[n];
        // 입력받은 문자열을 정수형 배열로 변경
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(solution(n, k, arr));
        sc.close();
    }
}
