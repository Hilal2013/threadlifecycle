package multithreading;

public class MultithreadRunnable implements Runnable{

    //implementing interface gives us  flexibility we can implement more interface and also we can extend another class
    // extends we can extend only ane class we cant achieve multiple inheritance
    private int threadNumber;
    public MultithreadRunnable(int threadNumber){
        this.threadNumber=threadNumber;
    }
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i + " from thread " +threadNumber);

            try {
                Thread.sleep(1000
                );//1 second between numbers print out  we can watch it
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
