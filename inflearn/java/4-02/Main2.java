import java.util.*;

public class Main2 {
    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                answer = "NO";
                break;
            }
            map.put(c, map.get(c) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();

        System.out.println(solution(input1, input2));
        sc.close();
    }
}
