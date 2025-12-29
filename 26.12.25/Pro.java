public class ShutdownHook {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(
            new Thread(() -> System.out.println("JVM Shutdown"))
        );
    }
}
