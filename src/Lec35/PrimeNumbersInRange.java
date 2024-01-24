package Lec35;

public class PrimeNumbersInRange {

    public static void main(String[] args) {

        int n = 89;

        // TC : n(n)^1/2
        for(int i=2;i<=89;i++){
            System.out.println(i +" : " + isPrime(i));
        }
    }

    private static boolean isPrime(int n){

        int i=2;
        while(i*i<=n){

            if(n%i==0){
                return false;
            }

            i++;
        }

        return true;
    }
}
