package chap06.abstraction.abstraction_via_abstract_class;

public class Main {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar("BMW");
        Car petrolCar = new PetrolCar("Audi");

        System.out.println("Driving the electric car: " + electricCar.getCarType() + "\n");
        electricCar.speedUp();
        electricCar.turnLeft();
        electricCar.slowDown();

        System.out.println("\n\nDriving the petrol car: " + petrolCar.getCarType() + "\n");
        petrolCar.slowDown();
        petrolCar.turnRight();
        petrolCar.turnLeft();
    }
}
