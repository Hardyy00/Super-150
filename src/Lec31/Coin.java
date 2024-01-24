package Lec31;

public class Coin {
    public static void main(String[] args) {
        int sum = 5;
        int[] coin = {1,1,1};

        printCom(sum,"",coin);
    }
    private static void printCom(int sum,String ans,int[] coins){

        if(sum==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<coins.length;i++){

            if(coins[i]>sum)
                return;

            printCom(sum-coins[i],ans+coins[i],coins);
        }
    }
}
