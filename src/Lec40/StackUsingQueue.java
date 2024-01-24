package Lec40;

import Lec39.DynamicQueue;

public class StackUsingQueue {

    private DynamicQueue<Integer> dq = new DynamicQueue<>();

    public boolean isEmpty(){
        return dq.isEmpty();
    }

    public int size(){
        return dq.size();
    }

    public void push(int item) throws Exception {
        dq.enqueue(item);
    }

    public int pop() throws Exception {

        DynamicQueue<Integer> hlp = new DynamicQueue<>();
        while(dq.size()>1){
            hlp.enqueue(dq.dequeue());
        }
        int x = (int) dq.dequeue();
        while(hlp.size()>0){
            dq.enqueue(hlp.dequeue());
        }

        return x;
    }

    public int peek() throws Exception {

        DynamicQueue<Integer> hlp = new DynamicQueue<>();
        while(dq.size()>1){
            hlp.enqueue(dq.dequeue());
        }
        int x = (int) dq.dequeue();
        while(hlp.size()>0){
            dq.enqueue(hlp.dequeue());
        }

        dq.enqueue(x);

        return x;
    }

    public static void main(String[] args) {

    }
}
