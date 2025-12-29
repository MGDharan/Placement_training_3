import java.util.*;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 9, 1};
        int k = 2;

        Arrays.sort(arr);
        System.out.println(arr[arr.length - k]);
    }
}
