package concurrency.activeobject;

/**
 * This is the Worker interface which provides a template for workers.
 * Servants who do actual work should implement this interface.
 */
public interface Worker {
    /**
     * This is the method to simulate work. The actual implementation depends on the type of worker.
     */
    void doWork();
}