package concurrency.barrier;

/**
 * BarrierDemo is the main class of this program.
 * It creates a SimpleCyclicBarrier and a set of Worker threads, 
 * and starts these threads to demonstrate the Barrier design pattern.
 */
public class RunBarrier {
    public static void runBarrier() {
        final int numWorkers = 3;
        CyclicBarrier barrier = new CyclicBarrier(numWorkers, () -> System.out.println("All workers have crossed the barrier"));

        for (int i = 0; i < numWorkers; i++) {
            new Thread(new Worker(barrier), "Worker " + i).start();
        }
    }
}
