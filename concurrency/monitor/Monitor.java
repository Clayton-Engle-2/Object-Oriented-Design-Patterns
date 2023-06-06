package concurrency.monitor;

public class Monitor {
    public static void mtestMonitor(String[] args) {
        Buffer sharedBuffer = new Buffer();
        Thread producerThread = new Thread(new Producer(sharedBuffer));
        Thread consumerThread = new Thread(new Consumer(sharedBuffer));

        producerThread.start();
        consumerThread.start();
    }
}