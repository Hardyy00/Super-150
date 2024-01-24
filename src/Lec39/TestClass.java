package Lec39;

public class TestClass {

    public static void main(String[] args) throws Exception {

        DynamicQueue<Character> dq = new DynamicQueue<>();

        dq.enqueue('c');
        dq.enqueue('d');
        dq.enqueue('e');
        dq.enqueue('f');
        System.out.println(dq.dequeue());
        System.out.println(dq.dequeue());
        dq.enqueue('g');
        dq.enqueue('h');
        dq.enqueue('i');
        dq.enqueue('j');

        dq.display();

    }
}
