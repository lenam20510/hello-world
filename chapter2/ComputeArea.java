package chapter2;

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {
        final double PI = 3.14159;
        double area;
        double radius;
        int i = 1, j = 2, k = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input value for radius: ");
        radius = input.nextDouble();
        
        //computer area
        area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }

}
