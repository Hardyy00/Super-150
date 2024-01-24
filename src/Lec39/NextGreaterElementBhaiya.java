package Lec39;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElementBhaiya {

    public static void main(String[] args) {

        int[] arr = {11,2,3,23,13,9,15};

        int[] greater = nextGreaterElement(arr);

        System.out.println(Arrays.toString(greater));
    }

    private static int[] nextGreaterElement(int[] arr){

        int[] ans = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<arr.length;i++){

            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){

                ans[stack.pop()] = arr[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()){

            ans[stack.pop()] = -1;
        }

        return ans;
    }
}
