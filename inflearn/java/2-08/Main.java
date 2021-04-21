import java.util.*;

public class Main {
    public static String solution(int n, int[] score) {
        int[] answer = new int[n]; // 등수를 저장하기 위한 배열 선언
        Arrays.fill(answer, 1); // 배열 요소를 1로 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (score[i] < score[j]) {
                    answer[i]++;
                }
            }
        }
        // int형 배열을 문자열로 변경 (공백 구분)
        return Arrays.toString(answer).replaceAll("[^0-9 ]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] input = sc.nextLine().split(" ");

        // 입력받은 문자열을 정수형 배열로 변경
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solution(n, arr));
        sc.close();
    }
}
