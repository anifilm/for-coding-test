import java.util.*;

public class Main {
    public static String solution(int n, String[] arr1, String[] arr2) {
        String answer = "";
        String winner = "";
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Integer.parseInt(arr1[i]) - Integer.parseInt(arr2[i]);
            if (result == 0)
                winner = "D";
            else if (result == 1 || result == -2)
                winner = "A";
            else if (result == -1 || result == 2)
                winner = "B";
            answer += winner + "\n";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 클리어
        String[] input1 = sc.nextLine().split(" ");
        String[] input2 = sc.nextLine().split(" ");

        System.out.println(solution(n, input1, input2));
    }
}
