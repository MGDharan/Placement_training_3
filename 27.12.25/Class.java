abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
