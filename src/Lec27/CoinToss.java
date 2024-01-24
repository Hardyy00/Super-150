package Lec27;

public class CoinToss {

    public static void main(String[] args) {

        System.out.println(makeTosses("",3));
    }

    private static int makeTosses(String ans,int n){

        if(ans.length()==n){
            return 1;
        }

        int a = makeTosses(ans+"H",n);
        int b = makeTosses(ans+"T",n);

        return a+b;
    }

}
