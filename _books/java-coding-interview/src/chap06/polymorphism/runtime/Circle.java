package chap06.polymorphism.runtime;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle ...");
    }
}
