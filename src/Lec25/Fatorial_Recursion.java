package Lec25;

public class Fatorial_Recursion {

    public static void main(String[] args) {

        int n = 5;
        System.out.println(fact(n));
    }

    private static int fact(int n){

        // base case
        if(n==0)
            return 1;

        return n*fact(n-1);
    }

}
