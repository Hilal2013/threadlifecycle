package multithreading;

public class MultithreadingRunnableMain {
    public static void main(String[] args){
        //create 3 thread
        for (int i = 1; i <=3 ; i++) {
            MultithreadRunnable myThing=new MultithreadRunnable(i);
           // we have extra line here //if we extend Thread class we dont need yhis
            Thread myThread=new Thread(myThing);
            myThread.start();
            try {
                //use join() if you have one thread that you want to wait for another to complete
                myThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        //1 from thread 1
        //2 from thread 1
        //3 from thread 1
        //4 from thread 1
        //5 from thread 1
        //1 from thread 2
        //2 from thread 2
        //3 from thread 2
        //4 from thread 2
        //5 from thread 2
        //1 from thread 3
        //2 from thread 3
        //3 from thread 3
        //4 from thread 3
        //5 from thread 3
    }
}
