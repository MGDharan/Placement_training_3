import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(sum - i))
                System.out.println(i + " " + (sum - i));
            set.add(i);
        }
    }
}
