import java.util.*;

public class Main {
    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (char c : map1.keySet()) {
            if (map1.get(c) != map2.get(c)) {
                answer = "NO";
                break;
            }
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
