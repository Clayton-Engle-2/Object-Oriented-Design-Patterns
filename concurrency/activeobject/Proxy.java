package concurrency.activeobject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * The Proxy class accepts requests and translates them to the scheduler.
 * It is capable of managing multiple workers and delegate tasks to them.
 */
public class Proxy {
    private ExecutorService service;
    private List<Worker> workers;

    /**
     * Constructor of Proxy. It initializes a single thread executor service and an empty list of workers.
     */
    public Proxy() {
        this.service = Executors.newSingleThreadExecutor();
        this.workers = new ArrayList<>();
    }

    /**
     * Adds a worker to the proxy.
     *
     * @param worker The worker to be added.
     */
    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    /**
     * This method simulates an asynchronous method invocation.
     * The Proxy receives the request and passes it to the scheduler (executor service).
     * 
     * @return A FutureResult which the client can use to get results.
     */
    public FutureResult doWork() {
        Future<?> future = service.submit(() -> workers.forEach(Worker::doWork));
        return new FutureResult(future);
    }
}
