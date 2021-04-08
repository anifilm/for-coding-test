import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int r = numbers[i] + numbers[j];
                // 중복이 없다면 ArrayList에 추가
                if (!resultList.contains(r)) resultList.add(r);
            }
        }
        // ArrayList sort
        Collections.sort(resultList);
        // ArrayList to Array (Integer -> int type)
        answer = resultList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] number1 = {2, 1, 3, 4, 1};
        int[] number2 = {5, 0, 2, 7};

        Solution sol = new Solution();

        int[] result1 = sol.solution(number1);
        System.out.println(Arrays.toString(result1));

        int[] result2 = sol.solution(number2);
        System.out.println(Arrays.toString(result2));
    }
}
