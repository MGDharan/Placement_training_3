import java.util.*;

public class MaxChar {
    public static void main(String[] args) {
        String s = "success";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        char maxChar = ' ';
        int max = 0;
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                maxChar = c;
            }
        }
        System.out.println(maxChar);
    }
}
