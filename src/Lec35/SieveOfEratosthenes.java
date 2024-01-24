package Lec35;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        primeSieve(100);
    }

    private static void primeSieve(int n){

        boolean[] prime = new boolean[n+1];
        prime[0]=prime[1]=true;         // considering every false to be a prime

        for(int i=2;i*i<=n;i++){

            if(!prime[i]){
                for(int k=2;k*i< prime.length;k++){
                    prime[i*k]= true;
                }
            }
        }


        for(int i=2;i< prime.length;i++){
            if(!prime[i])
                System.out.println(i);
        }
    }
}
