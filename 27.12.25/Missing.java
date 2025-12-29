import java.util.*;

public class MissingElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        Set<Integer> set = new HashSet<>();

        for (int i : arr) set.add(i);

        for (int i = 1; i <= 6; i++)
            if (!set.contains(i))
                System.out.println(i);
    }
}
