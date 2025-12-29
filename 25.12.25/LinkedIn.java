import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); list.add(2); list.add(3);

        Collections.reverse(list);
        System.out.println(list);
    }
}
