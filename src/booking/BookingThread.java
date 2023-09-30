package booking;

import java.util.concurrent.locks.Lock;

public class BookingThread implements  Runnable{
    int ticketsAvailable = 1;
    private Lock lock;

    public BookingThread(Lock lock) {
        this.lock = lock;
    }
    // Diff between Synchronized Block And Lock API
    // Synchronizedblock fully contained within a method
    // Fairness longest waiting thread is given to acces to the lock
    // lock.lockInterruptibly();
    // lock.tryLock();
    // LOCK API

    @Override
    public void run() {

        // First thread is doing something
        // Second started waiting
        // Third started waiting
        // Fourth started waiting
        System.out.println("Waiting to book the ticket for: " + Thread.currentThread().getName());
        lock.lock();
        if (ticketsAvailable > 0) {
            System.out.println("Booking ticket  for: " + Thread.currentThread().getName());
            // simulating sometimes to process the payment
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticketsAvailable--;
            System.out.println("Ticket BOOKED by: " + Thread.currentThread().getName());
            System.out.println("Available tickets: " + ticketsAvailable);
        } else {
            System.out.println("Ticket couldn't by " + Thread.currentThread().getName());
        }
        lock.unlock();
        System.out.println("Booking completed.");

    }



}
