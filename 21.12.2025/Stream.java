import java.util.*;
import java.util.stream.*;

public class StreamEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25);
        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
