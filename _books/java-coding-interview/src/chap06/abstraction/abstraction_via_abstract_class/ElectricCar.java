package chap06.abstraction.abstraction_via_abstract_class;

public class ElectricCar extends Car {
    public ElectricCar(String carType) {
        super(carType);
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the electric car");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the electric car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn right the electric car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn left the electric car");
    }
}
