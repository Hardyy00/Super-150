package Lec30;

public class LexiographicallyCounting {

    public static void main(String[] args) {

        printCounting(0,1000);
    }

    private static void printCounting(int num,int n){

        if(num>n)
            return;

        int i=0;
        if(num==0)
            i=1;
        System.out.println(num);

        for(;i<=9;i++){
            printCounting(num*10 +i,n);
        }
    }
}
