package chap06.method_overriding;

import chap06.method_overriding.inheritance.Child;
import chap06.method_overriding.inheritance.Parent;
import chap06.method_overriding.polymorphism.Concrete;

public class Main {
    public static void main(String[] args) {
        // 상속의 메서드 오버라이딩
        Parent parent = new Parent();
        Child child = new Child();

        parent.execute();
        child.execute();

        // 런타임 다형성의 메서드 상속
        Concrete concrete = new Concrete();
        concrete.execute();
    }
}
