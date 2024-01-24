package Lec31;

public class UniqueCoin {
    public static void main(String[] args) {
        int sum = 3;
        int[] coin = {1,1,1};

        printCom(sum,"",coin,0);
    }

    private static void printCom(int sum,String ans,int[] coins,int index){

        if(sum==0){
            System.out.println(ans);
            return;
        }

        for(int i=index;i<coins.length;i++){

            if(coins[i]>sum)
                return;

            printCom(sum-coins[i],ans+coins[i],coins,i);

        }

    }
}
