public class BuzzNumber {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(n % 7 == 0 || n % 10 == 7 ? "Buzz Number" : "Not Buzz");
    }
}
