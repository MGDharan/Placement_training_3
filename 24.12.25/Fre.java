import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String s = "java is easy and java is powerful";
        String[] words = s.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);

        System.out.println(map);
    }
}
