class A {
    synchronized void methodA(B b) {
        System.out.println("Thread1 in A");
        b.last();
    }
    synchronized void last() {
        System.out.println("Inside A last");
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread2 in B");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside B last");
    }
}

public class Deadlock {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        new Thread(() -> a.methodA(b)).start();
        new Thread(() -> b.methodB(a)).start();
    }
}
