package io.example.puzzles;

public class PrintSequenceBy3Threads {

    public static void main(String[] args) throws InterruptedException {
        new Thread(new PrintRunnable(1), "T1").start();
        new Thread(new PrintRunnable(2), "T2").start();
        new Thread(new PrintRunnable(0), "T3").start();

        Thread.sleep(10000);
    }

    public static class PrintRunnable implements Runnable {

        Integer reminder;

        public PrintRunnable(Integer reminder) {
            this.reminder = reminder;
        }

        private static int number = 1;
        private static int PRINT_UPTO = 10;
        private static Object lock = new Object();

        @Override
        public void run() {

            while (number < PRINT_UPTO-1) {
                synchronized (lock) {
                    while (number%3 != reminder) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number ++;
                    lock.notifyAll();
                }
            }
        }
    }
}
