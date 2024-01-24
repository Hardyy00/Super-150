package Lec39;

import java.util.ArrayDeque;
import java.util.Deque;

public class InsertAtBottom {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        insertAtBottom(stack,-7);
        System.out.println(stack);
    }

    private static void insertAtBottom(Deque<Integer> stack,int ele){

        if(stack.isEmpty()){
            stack.push(ele);
            return;
        }

        int po = stack.pop();
        insertAtBottom(stack,ele);
        stack.push(po);
    }
}
