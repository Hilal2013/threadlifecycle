package booking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Runnable runnable=new BookingThread(lock);
        Thread sam=new Thread(runnable, "Sam");
        Thread ozzy=new Thread(runnable, "Ozzy");
        sam.start();
        ozzy.start();
    }
}
