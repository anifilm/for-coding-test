import java.util.*;

public class Main {
    public static int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        for (char x: t.toCharArray()) {
            // bMap: a b c
            //       1 1 1
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }
        int len = t.length() - 1;
        for (int i = 0; i < len; i++) {
            // aMap: b a
            //       1 1
            aMap.put(s.charAt(i), aMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = len; rt < s.length(); rt++) {
            aMap.put(s.charAt(rt), aMap.getOrDefault(s.charAt(rt), 0) + 1);
            if (aMap.equals(bMap)) answer++;
            aMap.put(s.charAt(lt), aMap.get(s.charAt(lt)) - 1);
            if (aMap.get(s.charAt(lt)) == 0) aMap.remove(s.charAt(lt));
            lt++;
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
