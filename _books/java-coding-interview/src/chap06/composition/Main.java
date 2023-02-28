package chap06.composition;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("MyCar");

        System.out.println("Horsepower: " + car.getHorsepower());
    }
}
