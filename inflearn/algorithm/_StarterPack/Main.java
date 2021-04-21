import java.util.*;

public class Main {
    public static int solution(int a, int b) {
        int answer = a + b;
        return answer;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.println(solution(input1, input2));
    }
}
