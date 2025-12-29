import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4};

        Set<Integer> set = new HashSet<>();
        for (int i : a) set.add(i);

        for (int i : b)
            if (set.contains(i))
                System.out.println(i);
    }
}
