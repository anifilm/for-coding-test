import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int r = numbers[i] + numbers[j];
                if (!answer.contains(r)) answer.add(r);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}

public class Main2 {
    public static void main(String[] args) {
        int[] number1 = {2, 1, 3, 4, 1};
        int[] number2 = {5, 0, 2, 7};

        Solution sol = new Solution();

        ArrayList<Integer> result1 = sol.solution(number1);
        System.out.println(result1);

        ArrayList<Integer> result2 = sol.solution(number2);
        System.out.println(result2);
    }
}
