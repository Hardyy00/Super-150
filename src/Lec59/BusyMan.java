package Lec59;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {

    public static void main(String[] args) {
        Scanner  cin = new Scanner(System.in);

        int t = cin.nextInt();

        while(t-- > 0){

            int n = cin.nextInt();
            Integer[][] mat = new Integer[n][2];

            for(int i=0;i<n;i++){

                mat[i][0] = cin.nextInt();
                mat[i][1] = cin.nextInt();
            }

            Arrays.sort(mat, new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[1] - o2[1];
                }
            });

            int ans = 1;
            int end = mat[0][1];


            for(int i=1;i<n;i++){

                if(mat[i][0] >= end){
                    ans++;
                    end = mat[i][1];
                }
            }

            System.out.println(ans);
        }

    }
}
