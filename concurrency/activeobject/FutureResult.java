package concurrency.activeobject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * The FutureResult class holds a Future object for the client to get results.
 * It's essentially a wrapper around a Future that provides a convenient way
 * to retrieve computation results from the asynchronous execution.
 */
public class FutureResult {
    private Future<?> future;

    /**
     * Constructor of FutureResult. It initializes the future with given Future object.
     *
     * @param future The Future object that this FutureResult should wrap.
     */
    public FutureResult(Future<?> future) {
        this.future = future;
    }

    /**
     * Retrieves the result of the computation when it's available.
     * It blocks until the computation is complete.
     *
     * @throws InterruptedException If the current thread was interrupted while waiting
     * @throws ExecutionException If the computation threw an exception
     */
    public void getResult() throws InterruptedException, ExecutionException {
        future.get();
    }

    /**
     * Retrieves the result of the computation as a String when it's available.
     * It blocks until the computation is complete.
     *
     * @return A string representation of the computation result.
     * @throws InterruptedException If the current thread was interrupted while waiting
     * @throws ExecutionException If the computation threw an exception
     */
    public String getResultAsString() throws InterruptedException, ExecutionException {
        return future.get().toString();
    }
}
