package Lec64;

import java.util.Arrays;

public class WineProblem {

    public static void main(String[] args) {

        int[] arr = {2,3, 5,1,4};
        int n = arr.length;
        int[][] dp = new int[n][n];

        for(int[] row : dp) Arrays.fill(row,-1);

        System.out.println(solve(0,n-1,arr,dp, 1));
    }

    private static  int solve(int i, int j,int[] arr, int[][] dp, int day){

        if(i >j) return 0;

        if(i == j){
            return arr[i] * day;
        }

        if(dp[i][j] !=-1) return dp[i][j];

        int first = arr[i] * day + solve(i+1, j, arr, dp, day+1);

        int second = arr[j] * day + solve(i, j-1, arr, dp, day+1);

        return dp[i][j] = Math.max(first, second);


    }
}
