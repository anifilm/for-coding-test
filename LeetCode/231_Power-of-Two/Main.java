import java.util.*;

class Solution {
    public boolean solution(int n) {
        while(n > 0 && n%2 == 0) {
            n /= 2;
        }
        return n == 1 ? true : false;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(1));
        System.out.println(sol.solution(16));
        System.out.println(sol.solution(4));
        System.out.println(sol.solution(8));
    }
}
