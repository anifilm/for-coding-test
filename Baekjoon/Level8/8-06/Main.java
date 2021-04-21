import java.util.*;

public class Main {
    public static String solution(int t, int[][] inputs) {
        String answer = "";
        // 아파트 생성
        int[][] apt = new int[15][15];
        for(int i = 0; i < 15; i++) {
            apt[i][1] = 1; // i층 1호
            apt[0][i] = i; // 0층 i호
        }
        for(int i = 1; i < 15; i ++) { // 1층부터 14층까지
            for(int j = 2; j < 15; j++) { // 2호부터 14호까지
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }
        // 결과 저장
        for (var item : inputs) {
            int k = item[0];
            int n = item[1];
            answer += apt[k][n] + "\n";
        }
        return answer;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[][] inputs = new int[t][2];
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            inputs[i][0] = k;
            inputs[i][1] = n;
        }

        System.out.println(solution(t, inputs));
        sc.close();
    }
}
