import java.util.*;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        Set<Integer> set = new LinkedHashSet<>();

        for (int i : arr) set.add(i);
        System.out.println(set);
    }
}
