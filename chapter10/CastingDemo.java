package chapter10;

import sun.awt.DisplayChangedListener;

public class CastingDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Object circle1 = new Circle1();
        Object rectangle = new Rectangle();
        display(circle1);
        display(rectangle);
    }
    
    public static void display(Object object1) {
        if (object1 instanceof Circle1) {
            System.out.print("I found it ==");
            ((Circle1) object1).print();
        }
        else if (object1 instanceof Rectangle) {
            System.out.print("I found it ==");
            ((Rectangle) object1).print();
        }
    }

}

class Circle1 {
    public void print() {
        System.out.println("it's a Circle");
    }
}

class Rectangle {
    public void print() {
        System.out.println("it's a Rectangle");
    }
}