package chapter29;

public class TestPrint {

    public static void main(String[] args) {
        Runnable print100 = new PrintNumber(1, 100);
        Runnable print200 = new PrintNumber(2, 100);
        
        Thread thread1 = new Thread(print100);
        Thread thread2 = new Thread(print200);
        
        thread1.start();
        thread2.start();
    }

}
