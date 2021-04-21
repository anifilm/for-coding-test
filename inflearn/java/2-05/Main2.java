import java.util.*;

public class Main2 {
    public static int solution(int n) {
        int answer = 0;
        // 에라토스테네스 체를 통한 구현
        int[] a = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            a[i] = i; // 배열의 요소를 인덱스로 초기화
        }
        for (int i = 2; i <= n; i++) {
            if (a[i] == 0) // 이미 0으로 초기화된 수는 건너뛴다.
                continue;
            for (int j = i * 2; j <= n; j += i) {
                a[j] = 0; // 해당 하는 배수부터 가능한 모든 숫자를 0으로 초기화
            }
        }
        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) { // 0이 아닌 남아 있는 수를 출력
                answer++;
                //System.out.println(a[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
        sc.close();
    }
}
