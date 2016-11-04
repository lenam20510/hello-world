package chapter29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCooperation {
    private static Account account = new Account();
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(2);
        executors.execute(new DepositTask());
        executors.execute(new WithdrawTask());
        executors.shutdown();
        
        System.out.println("Thread 1\tThread 2\tThread 3");

    }
    
    public static class DepositTask implements Runnable {

        @Override
        public void run() {
            while (true) {
                account.deposit((int)(Math.random()*10));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static class WithdrawTask implements Runnable {

        @Override
        public void run() {
            while (true) {
                account.withdraw((int)(Math.random()*10));
            }
        }
    }
    
    private static class Account {
        private Lock lock = new ReentrantLock();
        private Condition newDeposit = lock.newCondition();
        private int balance = 0;
        
        public int getBalance() {
            return balance;
        }
        
        public void deposit(int amount) {
            lock.lock();
            try {
                balance += amount;
                System.out.println("Deposit " + amount + "\t\t\t" + getBalance());
                newDeposit.signalAll();
            } finally {
                lock.unlock();
            }
            
        }
        
        public void withdraw(int amount) {
            lock.lock();
            try {
                while (balance < amount) {
                    System.out.println("Withdraw " + amount + "\t\t\tWait for deposit");
                    newDeposit.await();
                }
                balance -= amount;
                System.out.println("Withdraw " + amount + "\t\t\t" + getBalance());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                lock.unlock();
            }
        }
    }
}

