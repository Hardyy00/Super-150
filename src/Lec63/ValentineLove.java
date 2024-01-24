package Lec63;

import java.util.Arrays;

public class ValentineLove {

    public static void main(String[] args) {

        int[] a = {4,5};
        int[] b = {1,2,3,4,5};

        int n = a.length, m = b.length;
        Arrays.sort(a);
        Arrays.sort(b);

        int[][] dp = new int[n][m];

        for(int[] row : dp) Arrays.fill(row, -1);
        System.out.println(solve(0,0, a, b, dp));
    }

    private static int solve(int i, int j, int[] a, int[] b, int[][] dp){

        if(i == a.length) return 0;

        if(j==b.length) return (int)1e7;

        if(dp[i][j]  != -1) return dp[i][j];

        int match = Math.abs(a[i] - b[j]) + solve(i+1, j+1, a,b,dp);

        int notMatch = solve(i,j+1, a,b,dp);

        return dp[i][j]  = Math.min(match, notMatch);

    }
}
