package chap06.polymorphism.runtime;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a triangle ...");
    }
}
