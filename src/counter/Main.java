package counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        CounterThread duplicateCounterThread = new CounterThread(counter);
        counterThread.start();
        duplicateCounterThread.start();
        counterThread.join();
        duplicateCounterThread.join();
        System.out.println(counter.c);


    }
}
