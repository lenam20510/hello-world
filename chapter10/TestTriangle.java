package chapter10;

public class TestTriangle {

    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("Yellow");
        triangle.setFilled(true);
        System.out.printf("%s \nArea = %f\nperimeter = %f\ncolor = %s\nfilled = %b",
                triangle.toString(), triangle.getArea(), triangle.getPeremiter(), triangle.getColor(), triangle.isFilled());

    }

}
