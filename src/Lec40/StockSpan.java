package Lec40;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StockSpan {

    public static void main(String[] args) {

        int[] arr = {10,4,5,90,120,80};

        int[] ans = stockSpan(arr);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] stockSpan(int[] arr){

        int[] ans = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<arr.length;i++){

            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? i +1: (i-stack.peek());

            stack.push(i);
        }

        return ans;
    }
}
