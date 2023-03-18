package chap06.interface_segregation_principle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Approach that doesn't follow ISP:\n");

        chap06.interface_segregation_principle.bad.WwwPingConnection www1 = new chap06.interface_segregation_principle.bad.WwwPingConnection("www.yahoo.com");

        www1.http();
        www1.socket(); // 이 메서드는 아무 것도 하지 않지만 클라이언트는 그것을 알지 못합니다.
        www1.connect();

        System.out.println("\nApproach that follow ISP:\n");

        chap06.interface_segregation_principle.good.WwwPingConnection www2 = new chap06.interface_segregation_principle.good.WwwPingConnection("www.yahoo.com");

        www2.http();
        www2.connect();
    }
}
