package chapter14;

public class TestEdible {

    public static void main(String[] args) {
        Object objects = new Apple();
        if (objects instanceof Edible) {
            System.out.println(((Edible)objects).howtoEat());
        }

    }

}

abstract class Fruit implements Edible {
    
}

class Apple extends Fruit {

    @Override
    public String howtoEat() {
        // TODO Auto-generated method stub
        return "Appled";
    }
    
}

