package Lec68;

public class PowerOf5 {

    public static void main(String[] args) {

        int n= 5;

        int sum =0;
        int mul = 5;

        while(n > 0){

            if((n&1)==1){
                sum += mul;
            }

            n >>=1;
            mul *= 5;
        }

        System.out.println(sum);
    }
}
