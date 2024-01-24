package Lec39;

import java.util.ArrayDeque;
import java.util.Deque;

// Find the last element in the stack TC : O(N) SC : O(1)

public class LastElement {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        System.out.println(bottomElement(stack));
    }

    private static int bottomElement(Deque<Integer> stack){

        if(stack.size()==1){
            return stack.peek();
        }

        int popped = stack.pop();
        int returned = bottomElement(stack);
        stack.push(popped);
        return returned;
    }
}
