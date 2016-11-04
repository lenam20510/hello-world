package chapter10;

public class Apple extends Fruit {

    public Apple() {}
    public static void main(String[] args) {
        Apple apple1 = new Apple();
//        apple1.printName();
//        System.out.println(apple1);
        printName(apple1);
    }
//    private void printName() {
//        System.out.println(super.getName());
//        System.out.println(this.getName());
//    }
    
    public String getName() {
        return "this's in subclass";
    }
    
    public static void printName(Fruit fruit) {
        if (fruit instanceof Apple)
        System.out.println(((Fruit)fruit).getName());
    }
}

class Fruit {
    
    public Fruit(String output) {
        System.out.println(output);
    }
    
    public Fruit() {
        System.out.println("this is a fruit");
    }
    
    protected String getName() {
        return "this's in superclass";
    }
    
    public String toString() {
        return "this is a Fruit";
    }
}
