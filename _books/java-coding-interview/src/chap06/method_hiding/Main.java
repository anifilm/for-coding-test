package chap06.method_hiding;

public class Main {
    public static void main(String[] args) {
        Vehicle.move(); // Vehicle의 move() 호출
        Car.move();     // Car의 move() 호출
    }
}
