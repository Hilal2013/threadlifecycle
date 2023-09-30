public class MyThread extends Thread{


    @Override
    public void run(){

        try {
           Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My thread is great");
    }
}
