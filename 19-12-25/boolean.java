class ProducerConsumer {
    private static int item;
    private static boolean available = false;

    static synchronized void produce() throws InterruptedException {
        while (available) wait();
        item = 100;
        available = true;
        notify();
    }

    static synchronized void consume() throws InterruptedException {
        while (!available) wait();
        System.out.println(item);
        available = false;
        notify();
    }

    public static void main(String[] args) {
        new Thread(() -> {
            try { produce(); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { consume(); } catch (Exception e) {}
        }).start();
    }
}
