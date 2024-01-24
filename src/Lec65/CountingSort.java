package Lec65;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        //sorts in linear time,
        // the order of occurrence is preserved
        // no comparisons are used

        int[] arr = {2,1,1,0,1,2,5,4,0,2,8,9,2,6,1,9};

        int max = 0;

        for(int i : arr) max = Math.max(max, i);

//        int max = Arrays.stream(arr).max().getAsInt();   getting a max value using library

        int[] fre = new int[max+1];

        for(int i : arr) fre[i]++;

        // to store the final position of the each number in the sorted array
        for(int i=1;i<fre.length;i++){
            fre[i] += fre[i-1];
        }

        int[] sorted = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            int val = arr[i];  // get the element in the array from the back , and find where it should be placed from in the answers array
            // (get the required position from the frequency array)
            sorted[fre[val]-1] = val;  // place at fre[val] - 1 position
            fre[val]--; // decrease the position

        }

        System.out.println(Arrays.toString(sorted));
    }
}
