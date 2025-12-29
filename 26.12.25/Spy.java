public class SpyNumber {
    public static void main(String[] args) {
        int n = 1124, sum = 0, prod = 1;

        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        System.out.println(sum == prod ? "Spy Number" : "Not Spy Number");
    }
}
