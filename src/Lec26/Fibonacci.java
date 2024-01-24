package Lec26;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    private static int fibo(int n){

       if(n<=1)
           return n;

       int f1 = fibo(n-1);
       int f2 = fibo(n-2);

       return f1+f2;

    }
}
