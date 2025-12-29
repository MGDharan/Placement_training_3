class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Giri");

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
