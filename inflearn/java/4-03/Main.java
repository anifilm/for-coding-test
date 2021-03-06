import java.util.*;

public class Main {
    public static String solution(int n, int k, int[] arr) {
        String answer = "";
        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();
        // 시간초과가 되므로 Two Pointers Algorithm 적용 필요
        for (int i = 0; i < n-k+1; i++) {
            for (int j = i; j < i+k; j++) {
                set.add(arr[j]);
            }
            cnt = set.size();
            answer += cnt + " ";
            set.clear();
        }
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
