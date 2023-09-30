public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello World!");
//     //how many thread are active now to see
//        System.out.println(Thread.activeCount());//2
//        System.out.println(Thread.currentThread().getName());//main thread
//        System.out.println(Thread.currentThread().getState());//runnable state
        //  Thread.sleep(1000L);
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());//NEW
        myThread.start();
        System.out.println(myThread.getState());//runnable //My thread is great //converted to runnable
        myThread.sleep(1000L);//we have to wait 1 second to write
        System.out.println(myThread.getState());//TIMED_WAITING //My thread is great

        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.start();//My runnable thread is great

    }
}
