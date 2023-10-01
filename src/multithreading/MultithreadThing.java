package multithreading;

public class MultithreadThing extends Thread{

    private int threadNumber;
    public MultithreadThing(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override  //good practice
    public void run(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i + " from thread " +threadNumber);
            if (threadNumber==3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000
                );//1 second between numbers print out  we can watch it
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
