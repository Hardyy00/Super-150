package Lec44;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner cin = new Scanner(System.in);
        int t= cin.nextInt();

        while(t-->0){
            int n = cin.nextInt();
            int c = cin.nextInt();

            int[] stalls = new int[n];
            for(int i=0;i<stalls.length;i++){
                stalls[i] = cin.nextInt();
            }
            Arrays.sort(stalls);
            System.out.println(aggressiveCows(stalls,c));
        }
    }

    private static boolean isValidMinimumDistance(int[] stalls,int minDistance,int cows){

        cows--;
        int placed = stalls[0];
        for(int i=1;i<stalls.length;i++){

            if(stalls[i]-placed>=minDistance){
                cows--;
                placed = stalls[i];
            }
            if(cows==0) return true;
        }

        return false;
    }

    private static int aggressiveCows(int[] stalls,int c){

        int low = stalls[0];
        int high = stalls[stalls.length-1];
        int ans = 0;

        while(low<=high){

            int mid = high + (low-high)/2;

            if(isValidMinimumDistance(stalls,mid,c)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
    }
}