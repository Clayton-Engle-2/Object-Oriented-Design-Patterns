package concurrency.activeobject;

import java.util.concurrent.ExecutionException;

/**
 * The client class, which interacts with the Proxy.
 */
public class RunActiveObject {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Proxy proxy = new Proxy();
        proxy.addWorker(new Servant());

        // This is a non-blocking call.
        FutureResult result = proxy.doWork();

        // Blocks until the result is available.
        result.getResult();

        System.out.println("Work is done.");
    }
}