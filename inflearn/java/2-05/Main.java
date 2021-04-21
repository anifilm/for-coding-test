import java.util.*;

public class Main {
    public static int solution(int n) {
        int answer = 0;
        int i;
        // 느린 알고리즘 구현 (시간제한에 걸린다.)
        for (int num = 2; num <= n; num++) {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (num == i) {
                answer++;
                //System.out.println(num);
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
