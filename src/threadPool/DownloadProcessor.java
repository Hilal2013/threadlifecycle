package threadPool;

public class DownloadProcessor implements Runnable{
    private String fileName;

    public DownloadProcessor(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "has started download the file");
        try{
          Thread.sleep(2500);
        }catch(InterruptedException e){
            new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+ "download finished");

    }
}
