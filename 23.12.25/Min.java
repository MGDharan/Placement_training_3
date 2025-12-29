public class MinMax {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 7};
        int min = arr[0], max = arr[0];

        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
