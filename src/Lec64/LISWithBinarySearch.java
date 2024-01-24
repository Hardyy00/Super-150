package Lec64;

import java.util.ArrayList;
import java.util.List;

public class LISWithBinarySearch {

    public static void main(String[] args) {

        int[] arr = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};

        List<Integer> ls = new ArrayList<>();

        ls.add(arr[0]);

        for(int i=1;i<arr.length;i++){

            if(arr[i] > ls.get(ls.size()-1)) ls.add(arr[i]);
            else {

                int lowerBound = bs(ls, arr[i]);

                ls.set(lowerBound, arr[i]);
            }
        }

        System.out.println(ls.size());

    }

    private static  int bs(List<Integer> ls , int val){

        int ans = -1;

        int low = 0;
        int high = ls.size()-1;

        while(low <= high){

            int mid = high + (low -high)/2;

            if(ls.get(mid) < val) low = mid+1;
            else {
                ans = mid;
                high = mid-1;
            }
        }

        return ans;
    }
}
