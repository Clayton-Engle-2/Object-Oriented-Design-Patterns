package concurrency.barrier;

/**
 * CyclicBarrier is a simplified version of the CyclicBarrier class.
 */
public class CyclicBarrier {
    private int count;
    private Runnable barrierAction;
    private int initialCount;

    /**
     * Constructor for the SimpleCyclicBarrier class.
     *
     * @param count The number of threads that must invoke await before the barrier is tripped
     * @param barrierAction The command to execute when the barrier is tripped
     */
    public CyclicBarrier(int count, Runnable barrierAction) {
        this.count = count;
        this.initialCount = count;
        this.barrierAction = barrierAction;
    }

    /**
     * Awaits all other threads to reach this point of execution. Once all threads have called await,
     * the barrierAction (if any) is executed, and all threads continue execution past the await.
     *
     * This method is synchronized to prevent concurrent modification of the count.
     */
    public synchronized void await() {
        count--;
        if (count == 0) {
            if (barrierAction != null) {
                barrierAction.run();
            }
            // Reset the count for future use.
            count = initialCount;
        } else {
            while (count != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        // Wake up all threads that are waiting for the count to reach 0.
        notifyAll();
    }
}
