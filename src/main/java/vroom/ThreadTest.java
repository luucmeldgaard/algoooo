package vroom;

import java.util.Arrays;

public class ThreadTest implements Runnable{

    int counter;
    static int nextThreadNum = 1;
    int threadNum;

    public ThreadTest() {
        this.counter = 0;
        this.threadNum = nextThreadNum;
        nextThreadNum += 1;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            ThreadTest threadTest = new ThreadTest();
            Thread thread = new Thread(threadTest);
            thread.start();
            Thread.sleep(3000);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread" + this.threadNum + ": " + this.counter);
                this.counter += 1;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String a = "dafdsdf";
            char d = 'd';
            a.contains(String.valueOf(d));
        }

    }
}
