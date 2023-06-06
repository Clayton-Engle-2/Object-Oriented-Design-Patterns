package concurrency.barrier;

/**
 * Worker is a class representing a worker thread that performs some work and then waits at a barrier.
 */
public class Worker implements Runnable {
	
    private final CyclicBarrier barrier;

    /**
     * Constructor for the Worker class.
     *
     * @param barrier The SimpleCyclicBarrier that this worker should wait at.
     */
    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    /**
     * The run method is called when the thread is started.
     * It performs some work and then waits at the barrier.
     */
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is doing work");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
