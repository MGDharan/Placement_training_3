import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }
}

public class ListToMap {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student(1, "A"),
            new Student(2, "B")
        );

        Map<Integer, String> map =
            list.stream().collect(Collectors.toMap(s -> s.id, s -> s.name));

        System.out.println(map);
    }
}
