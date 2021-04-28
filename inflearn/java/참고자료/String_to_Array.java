import java.util.*;

class Main {
    public static void main(String[] args) {
        var number = "075-0623456-72";
        var parts = number.split("-"); // 문자열 -> String 배열, split() 메서드 사용
                                       // ["075", "0623456", "72"]

        System.out.println(Arrays.toString(parts)); // String 배열 내용 출력
                                                    // "075-0623456-72"
        var joinParts = String.join("+", parts); // String 배열 -> 문자열
        System.out.println(joinParts);           // "075+0623456+72"
    }
}
