package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        DownloadProcessor downloadProcessor=new DownloadProcessor("File1");
        DownloadProcessor downloadProcessor2=new DownloadProcessor("File2");
        DownloadProcessor downloadProcessor3=new DownloadProcessor("File3");
        DownloadProcessor downloadProcessor4=new DownloadProcessor("File4");
        DownloadProcessor downloadProcessor5=new DownloadProcessor("File5");
        executorService.submit(downloadProcessor);
        executorService.submit(downloadProcessor2);
        executorService.submit(downloadProcessor3);
        executorService.submit(downloadProcessor4);
        executorService.submit(downloadProcessor5);
executorService.shutdown();

     //   downloadProcessor.run();
    }
}
