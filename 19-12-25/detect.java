class Node {
    int val;
    Node next;
    Node(int v) { val = v; }
}

public class CycleDetection {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        c.next = b;

        Node slow = a, fast = a;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        System.out.println(cycle);
    }
}
