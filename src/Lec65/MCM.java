package Lec65;

import java.util.Arrays;

public class MCM {

    public static void main(String[] args) {


        int[] arr = {4,2,3,5,1};

        int n = arr.length;
        int[][] dp = new int[n][n];

        for(int[] row : dp) Arrays.fill(row, -1);

        System.out.println(solve(0,n-1,arr,dp));
    }

    private static int solve(int i, int j, int[] arr, int[][] dp){

        if(j==i+1) return 0;

        if(dp[i][j] !=-1) return dp[i][j];

        int min = Integer.MAX_VALUE;

        for(int k=i+1;k<j;k++){

            int op = arr[i] * arr[k] * arr[j] + solve(i,k, arr,dp) + solve(k,j, arr,dp);
            min = Math.min(min, op);


        }

        return dp[i][j] = min;
    }
}
