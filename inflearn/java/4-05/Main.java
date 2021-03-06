import java.util.*;

public class Main {
    public static int solution(int n, int k, int[] arr) {
        int answer = -1, sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int l = j+1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        Collections.reverse(list);
        // k번째의 요소가 없는 경우가 있기 때문에 이 구문에서 오류 발생 가능성 있음
        // answer = list.get(k-1);
        int cnt = 0;
        for (int x : list) {
            cnt++;
            if (k == cnt) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);

        String[] input2 = sc.nextLine().split(" ");
        int[] arr = new int[n];
        // 입력받은 문자열을 정수형 배열로 변경
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(solution(n, k, arr));
        sc.close();
    }
}
