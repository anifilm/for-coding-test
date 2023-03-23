package chap06.method_overriding.polymorphism;

public class Concrete implements Base {
    @Override
    public void execute() {
        System.out.println("Execute concrete code ...");
    }
}
