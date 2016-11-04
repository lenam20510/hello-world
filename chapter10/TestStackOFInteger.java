package chapter10;

public class TestStackOFInteger {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        int max = 18;
        for (int i = 0; i < max; i++) {
            stack.push((int)(Math.random() * 100));
        }
        for (int i = 0; i < max; i++) {
            System.out.printf("position %d = %d\n", i, stack.pop());
        }
    }

}
