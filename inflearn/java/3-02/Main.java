import java.util.*;

public class Main {
    public static String solution(int n, int m, int[] arr1, int[] arr2) {
        int[] tmp = new int[n + m];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 같은 요소를 찾아서 tmp 배열에 임시 저장
                if (arr1[i] == arr2[j]) {
                    tmp[idx++] = arr1[i];
                }
            }
        }
        // 임시 저장된 배열 요소를 새 배열에 저장후 정렬
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++) {
            answer[i] = tmp[i];
        }
        Arrays.sort(answer);
        // int형 배열을 문자열로 변경 (공백 구분)
        return Arrays.toString(answer).replaceAll("[^0-9 ]", "");
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
