import java.util.*;

public class Main2 {
    public static char solution(int n, String str) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            //System.out.println(c + " " + map.get(c));
            if (map.get(c) + 1 > max) {
                max = map.get(c) + 1;
                answer = c;
            }
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
