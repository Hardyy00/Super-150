package Lec62;

import java.util.PriorityQueue;

public class MergingCost{

    public static void main(String[] args){

        int[] arr = {2, 3, 4, 1, 5, 7};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int ans = 0;

        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            ans += (a+b);

            pq.offer(a+b);
        }

        System.out.println(ans);
    }
}
