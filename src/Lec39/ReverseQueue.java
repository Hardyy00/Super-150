package Lec39;

public class ReverseQueue {

    public static void main(String[] args) throws Exception {

        DynamicQueue<Integer> dq = new DynamicQueue<>();
        dq.enqueue(10);
        dq.enqueue(20);
        dq.enqueue(30);
        dq.enqueue(40);
        dq.enqueue(50);

        dq.display();

        reverseQueue(dq);

        dq.display();
    }

    private static void reverseQueue(DynamicQueue<Integer> dq) throws Exception {

        if(dq.isEmpty()){
            return;
        }

        int ele = (int) dq.dequeue();
        reverseQueue(dq);
        dq.enqueue(ele);

    }
}