package concurrency.readwritelock;

/**
 * Reader is a class representing a reader thread that reads data from a shared resource.
 */
public class Reader implements Runnable {
    private SharedResource resource;

    /**
     * Constructor of the Reader class.
     *
     * @param resource The shared resource to read from.
     */
    public Reader(SharedResource resource) {
        this.resource = resource;
    }

    /**
     * The run method is called when the thread is started.
     * It calls the readData method of the shared resource 10 times.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.readData();
        }
    }
}