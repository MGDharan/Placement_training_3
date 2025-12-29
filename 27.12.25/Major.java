import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for (int key : map.keySet()) {
            if (map.get(key) > arr.length / 2) {
                System.out.println(key);
                return;
            }
        }
        System.out.println("No Majority Element");
    }
}
