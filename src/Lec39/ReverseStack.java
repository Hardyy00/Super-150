package Lec39;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseStack {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        reverseStack(stack);

        System.out.println(stack);
    }

    private static void reverseStack(Deque<Integer> stack){

        if(stack.isEmpty()) return;

        int ele = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,ele);
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
