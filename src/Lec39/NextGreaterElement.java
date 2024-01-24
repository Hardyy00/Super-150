package Lec39;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {2,1,3,9,8,4,7,8};

        int[] greater = nextGreater(arr);

        System.out.println(Arrays.toString(greater));
    }

    private static int[] nextGreater(int[] arr){

        int[] greater = new int[arr.length];

        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }

            greater[i] = stack.isEmpty() ?-1 : stack.peek();

            stack.push(arr[i]);
        }

        return greater;
    }
}
