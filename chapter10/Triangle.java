package chapter10;

public class Triangle extends GeometricObject
    implements Comparable{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    public Triangle() {}
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1() {
        return side1;
    }
    
    public double getSide2() {
        return side1;
    }
    
    public double getSide3() {
        return side1;
        
    }
    
    public double getArea() {
        return ((side1 * side2) / 2);
    }
    
    public double getPeremiter() {
        return (side1 + side2 + side3);
    }
    
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
       
        return 0;
    }
}
