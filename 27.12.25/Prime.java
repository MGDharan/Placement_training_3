public class PrimeCount {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7};
        int count = 0;

        for (int i : arr)
            if (isPrime(i)) count++;

        System.out.println(count);
    }
}
