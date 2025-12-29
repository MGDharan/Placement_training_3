public class ThreadPriority extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();

        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
