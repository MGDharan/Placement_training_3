class Shared {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available) wait();
        data = value;
        available = true;
        notify();
    }

    synchronized int consume() throws InterruptedException {
        while (!available) wait();
        available = false;
        notify();
        return data;
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Shared s = new Shared();

        new Thread(() -> {
            try { s.produce(10); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { System.out.println(s.consume()); } catch (Exception e) {}
        }).start();
    }
}
