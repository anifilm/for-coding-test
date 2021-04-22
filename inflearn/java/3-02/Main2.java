import java.util.*;

public class Main2 {
    public static String solution(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2 = 0;
            }
            else {
                if (p2 < m-1) {
                    p2++;
                }
                else {
                    p1++;
                    p2 = 0;
                }
            }
        }
        Collections.sort(answer); // 리스트를 정렬
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

/*
Time Limit 1499ms (1000ms 제한)
배열을 먼저 정렬 후 비교 연산 하면 통과 가능
*/
