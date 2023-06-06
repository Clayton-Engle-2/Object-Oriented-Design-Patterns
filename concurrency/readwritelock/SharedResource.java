package concurrency.readwritelock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * SharedResource is a class that represents a resource that can be 
 * accessed simultaneously by multiple reader threads but only by one writer thread at a time.
 */
public class SharedResource {
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private int data;
    
    /**
     * This method writes data into the shared resource. 
     * It locks the writeLock, which prevents any threads from reading or writing until it is unlocked.
     * Only one writer thread can hold the writeLock at a time, ensuring exclusive write access.
     * 
     * @param data The data to be written into the shared resource.
     */
    public void writeData(int data) {
        rwLock.writeLock().lock();
        try {
            this.data = data;
            System.out.println("Data written: " + data);
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    /**
     * This method reads data from the shared resource.
     * It locks the readLock, which allows multiple reader threads to read data simultaneously,
     * but prevents any threads from writing until all readers have released their locks.
     * 
     * @return The data read from the shared resource.
     */
    public int readData() {
        rwLock.readLock().lock();
        try {
            System.out.println("Data read: " + data);
            return data;
        } finally {
            rwLock.readLock().unlock();
        }
    }
}
