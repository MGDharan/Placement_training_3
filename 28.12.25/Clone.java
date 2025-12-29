class Student implements Cloneable {
    int id;

    Student(int id) {
        this.id = id;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(101);
        Student s2 = (Student) s1.clone();

        System.out.println(s1.id + " " + s2.id);
    }
}
