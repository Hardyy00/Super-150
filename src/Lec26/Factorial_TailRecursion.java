package Lec26;

public class Factorial_TailRecursion {

    public static void main(String[] args) {

        int n = 5;
        System.out.println(print(n,1));
    }

    private static int print(int n,int fact){

        if(n==0)
            return fact;

        return print(n-1,fact*n);
    }
}
