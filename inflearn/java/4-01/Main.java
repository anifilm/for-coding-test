import java.util.*;

public class Main {
    public static String solution(int n, String str) {
        String answer = "";
        int cnt = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : str.split("")) {
            int count = map.containsKey(s) ? map.get(s) : 0;
            if (cnt < count + 1) {
                cnt = count + 1;
                answer = s;
            }
            map.put(s, count + 1);
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
