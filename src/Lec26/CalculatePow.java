package Lec26;

public class CalculatePow {

    public static void main(String[] args) {

        System.out.println(pow(2,3,0));
    }

    private static int pow(int a,int b,int t){

        if(t==b)
            return 1;

        return a*pow(a,b,t+1);

    }


}
