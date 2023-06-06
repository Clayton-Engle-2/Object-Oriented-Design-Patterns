package concurrency.readwritelock;

/**
 * RunRWLock is the main class of this program.
 * It creates a shared resource and multiple reader and writer threads, 
 * and starts these threads to demonstrate the reader-writer lock pattern.
 */
public class RunRWLock {
    public void testRWLock() {
        SharedResource sharedResource = new SharedResource();

        Thread writerThread = new Thread(new Writer(sharedResource));
        Thread readerThread1 = new Thread(new Reader(sharedResource));
        Thread readerThread2 = new Thread(new Reader(sharedResource));

        writerThread.start();
        readerThread1.start();
        readerThread2.start();
    }
}