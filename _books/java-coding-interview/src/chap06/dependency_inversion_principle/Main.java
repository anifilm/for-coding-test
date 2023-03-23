package chap06.dependency_inversion_principle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Approach that doesn't follow DIP:\n");

        chap06.dependency_inversion_principle.bad.PostgreSQLJdbcUrl p1
          = new chap06.dependency_inversion_principle.bad.PostgreSQLJdbcUrl("my_db");
        chap06.dependency_inversion_principle.bad.ConnectToDatabase c1
          = new chap06.dependency_inversion_principle.bad.ConnectToDatabase();

        c1.connect(p1);

        System.out.println("\nApproach that follow ISP:\n");

        chap06.dependency_inversion_principle.good.PostgreSQLJdbcUrl p2
          = new chap06.dependency_inversion_principle.good.PostgreSQLJdbcUrl("my_db");
        chap06.dependency_inversion_principle.good.MySQLJdbcUrl p3
          = new chap06.dependency_inversion_principle.good.MySQLJdbcUrl("my_db");

        chap06.dependency_inversion_principle.good.ConnectToDatabase c2
          = new chap06.dependency_inversion_principle.good.ConnectToDatabase();

        c2.connect(p2);
        c2.connect(p3);
    }
}
