package concurrency.activeobject;

/**
 * The Servant class, which implements Worker interface and does actual work.
 */
public class Servant implements Worker {
    /**
     * This method simulates a type of work done by the servant.
     * It pauses for 1 second to simulate work being done.
     */
    @Override
    public void doWork() {
        System.out.println("Servant is working...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}