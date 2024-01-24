package Lec27;

public class ConsecutiveHeadToss {

    public static void main(String[] args) {

        System.out.println(printTosses("",2));
    }

    private static int printTosses(String s ,int n){

        if(s.length()==n){
            System.out.println(s);
            return 1;
        }
        int a = 0;
        if(s.length() == 0 || s.charAt(s.length()-1)!='H'){
            a += printTosses(s + 'H',n);
        }
            a+= printTosses(s+"T",n);


        return a;

    }
}
