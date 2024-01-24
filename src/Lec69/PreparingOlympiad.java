package Lec69;

import java.util.Scanner;

public class PreparingOlympiad {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int n= cin.nextInt();
        long l = cin.nextLong();
        long r = cin.nextLong();
        long x = cin.nextLong();

        long[] arr= new long[n];

        for(int i=0;i<n;i++){
            arr[i] = cin.nextLong();
        }

        System.out.println(countPossibleWays(n,l,r,x,arr));
    }

    private static int countPossibleWays(int n, long l, long r, long x, long[] arr){

        int count=0;

        int totSubsets = 1 << arr.length;

        for(int i=3;i<totSubsets;i++){

            long mini = Integer.MAX_VALUE;
            long maxi = Integer.MIN_VALUE;
            long sum = 0;

            if(countBits(i) >=2){

                for(int j=0;j<arr.length;j++){

                     if( (i & (1 << j)) !=0 ){
                         mini = Math.min(mini,arr[j]);
                         maxi = Math.max(maxi,arr[j]);
                         sum += arr[j];
                     }
                }

                if(sum >=l && sum <=r && (maxi-mini) >=x){

                    count++;
                }
            }
        }

        return count;

    }

    private static int countBits(int num){

        int cn  =0;
        while(num !=0){

            num = num &(num-1);
            cn++;
        }

        return cn;
    }
}
