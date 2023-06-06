package concurrency.readwritelock;

/**
 * Writer is a class representing a writer thread that writes data into a shared resource.
 */
public class Writer implements Runnable {
    private SharedResource resource;

    /**
     * Constructor of the Writer class.
     *
     * @param resource The shared resource to write to.
     */
    public Writer(SharedResource resource) {
        this.resource = resource;
    }

    /**
     * The run method is called when the thread is started.
     * It calls the writeData method of the shared resource 10 times, passing in the index as data.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.writeData(i);
        }
    }
}