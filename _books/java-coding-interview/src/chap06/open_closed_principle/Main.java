package chap06.open_closed_principle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Approach that doesn't follow OCP:\n");

        chap06.open_closed_principle.bad.Circle c1 = new chap06.open_closed_principle.bad.Circle(4);
        chap06.open_closed_principle.bad.Circle c2 = new chap06.open_closed_principle.bad.Circle(3);
        chap06.open_closed_principle.bad.Rectangle r1 = new chap06.open_closed_principle.bad.Rectangle(5, 3);

        List<chap06.open_closed_principle.bad.Shape> shapes1 = List.of(c1, c2, r1);

        chap06.open_closed_principle.bad.AreaCalculator rac1 = new chap06.open_closed_principle.bad.AreaCalculator(shapes1);

        System.out.println("Sum area: " + rac1.sum());

        System.out.println("\nApproach that follow OCP:\n");

        chap06.open_closed_principle.good.Circle c11 = new chap06.open_closed_principle.good.Circle(4);
        chap06.open_closed_principle.good.Circle c21 = new chap06.open_closed_principle.good.Circle(3);
        chap06.open_closed_principle.good.Rectangle r11 = new chap06.open_closed_principle.good.Rectangle(5,3);

        List<chap06.open_closed_principle.good.Shape> shapes2 = List.of(c11, c21, r11);

        chap06.open_closed_principle.good.AreaCalculator rac2
          = new chap06.open_closed_principle.good.AreaCalculator(shapes2);

        System.out.println("Sum area: " + rac2.sum());
    }
}
