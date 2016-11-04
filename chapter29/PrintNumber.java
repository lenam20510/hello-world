package chapter29;

public class PrintNumber implements Runnable {
    
    private int number, times;
    
    public PrintNumber(int number, int times) {
        this.number = number;
        this.times = times;
    }

    @Override
    public void run() { 
        try {
            for (int i = 0; i < times; i++) {
                System.out.print(number + " ");
                if (i > 50 ) Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        
    }

}
