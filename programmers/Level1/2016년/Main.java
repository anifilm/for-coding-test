import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String[] answer = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] monthEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        // 해당월 이전 까지의 일수를 구한다.
        for (int i = 0; i < a - 1; i++) {
            days += monthEnd[i];
        }
        days += b - 1; // 월의 일수와 해당월의 일수를 더하고 하루를 뺀다.(인덱스화)
        //System.out.println(days%7);
        return answer[days%7];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(1, 1));
        System.out.println(sol.solution(5, 24));
    }
}
