package threadPool;

public class DownloadProcessor implements Runnable{
    private String fileName;

    public DownloadProcessor(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "has started download the file: " +fileName );
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "download is finished. the file: " +fileName );
    }
}
