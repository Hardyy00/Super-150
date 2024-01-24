package Lec69;

public class TavaAndSaddas {

    public static void main(String[] args) {

        String num = "444";

        solve(num);
    }

    private static void solve(String num){

        int n = num.length();

        int x = (1 << n) - 2;  // total number of lucky number from len 1 to n-1 length

        int y =0,it=0;   // y = tot lucky numbers , of length n ,less than current number ,,therefore index will be x + y + 1



        for(int i=n-1;i>=0;i--){

            if(num.charAt(i) =='7'){
                y += (1 << it);
            }

            it++;
        }

        System.out.println(x + y + 1);

    }
}
