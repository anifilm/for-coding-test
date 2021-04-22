import java.util.*;

public class Main2 {
    public static String solution(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while(p1 < n) {
            answer.add(arr1[p1++]);
        }
        while(p2 < n) {
            answer.add(arr2[p2++]);
        }
        // ArrayList<Integer>의 요소를 문자열로 변경 (공백 구분)
        return answer.toString().replaceAll("\\[|,|\\]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] input1 = sc.nextLine().split(" ");
        int[] arr1 = new int[n];
        // 입력받은 문자열을 정수형 배열로 변경
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        int m = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] input2 = sc.nextLine().split(" ");
        int[] arr2 = new int[m];
        // 입력받은 문자열을 정수형 배열로 변경
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(solution(n, m, arr1, arr2));
        sc.close();
    }
}
