import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n == 1 ? "Happy Number" : "Not Happy");
    }
}
