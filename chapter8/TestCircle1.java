package chapter8;

public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        System.out.println("The area of the circle of radius " + circle1.getArea());
        Circle1 circle2 = new Circle1(0.25);
        System.out.println("The area of the circle of radius :" + circle2.getArea());
        Circle1 circle3 = new Circle1(125);
        System.out.println("The area of the circle of radius :" + circle3.getArea());
        circle3.radius = 100;
        System.out.println("The area of the circle of radius :" + circle3.getArea());
        System.out.println("radius value of circle1 is " + circle2.radius);
    }
}

class Circle1 {
    static double radius;
    Circle1() {
        radius = 1.0;
    }
    Circle1(double newRadius) {
        radius = newRadius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
}