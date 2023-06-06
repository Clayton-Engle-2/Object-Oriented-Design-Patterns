package concurrency.monitor;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            int value = buffer.get();
            System.out.println("Consumer got: " + value);
        }
    }
}