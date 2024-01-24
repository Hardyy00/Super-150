package Lec45;

import java.util.Scanner;

public class MinimumPageAllocation {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while(t-->0){

            int n = cin.nextInt();
            int m = cin.nextInt();

            int[] pages = new int[n];
            for(int i=0;i<n;i++) pages[i] = cin.nextInt();

            System.out.println(minimumPages(pages,m));
        }
    }

    private static int minimumPages(int[] pages,int students){

        int sum =0;
        for(int i : pages) sum += i;

        int low = 0;
        int high = sum;
        int ans = 0;

        while(low<=high){

            int mid = high + (low-high)/2;

            if(isPossible(pages,mid,students)){
                ans =  mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }

    private static boolean isPossible(int[] pages, int mid, int students) {
        int student =1;
        int readPages = 0;
        int i =0;
        while(i<pages.length){
            if(readPages + pages[i] <=mid){
                readPages += pages[i];
                i++;
            }else{
                student++;
                readPages = 0;
            }

            if(student > students) return false;
        }

        return true;


    }
}
