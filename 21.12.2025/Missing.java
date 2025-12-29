public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i : arr) sum += i;

        System.out.println("Missing: " + (total - sum));
    }
}
