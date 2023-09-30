package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {

        ExecutorService uploadPool = Executors.newCachedThreadPool();
        UploadProcessor uploadProcessor = new UploadProcessor("File 6");
        UploadProcessor uploadProcessor2 = new UploadProcessor("File 7");
        UploadProcessor uploadProcessor3 = new UploadProcessor("File 8");
        UploadProcessor uploadProcessor4 = new UploadProcessor("File 9");
        UploadProcessor uploadProcessor5 = new UploadProcessor("File 10");
        UploadProcessor uploadProcessor6 = new UploadProcessor("File 11");
        UploadProcessor uploadProcessor7 = new UploadProcessor("File 12");
        UploadProcessor uploadProcessor8 = new UploadProcessor("File 13");
        UploadProcessor uploadProcessor9 = new UploadProcessor("File 14");

        uploadPool.submit(uploadProcessor);
        uploadPool.submit(uploadProcessor2);
        uploadPool.submit(uploadProcessor3);
        uploadPool.submit(uploadProcessor4);
        uploadPool.submit(uploadProcessor5);
        uploadPool.submit(uploadProcessor6);
        uploadPool.submit(uploadProcessor7);
        uploadPool.submit(uploadProcessor8);
        uploadPool.submit(uploadProcessor9);

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) uploadPool;

        System.out.println( "Available threads: " + threadPoolExecutor.getPoolSize());

        uploadPool.shutdown();

    }
    }


