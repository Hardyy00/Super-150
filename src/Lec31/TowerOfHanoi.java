package Lec31;

public class TowerOfHanoi {

    public static void main(String[] args) {

        int n = 3;
        toh(n,'A','B','C');
    }

    private static void toh(int n,char src,char hlp,char des){

        if(n==0)
            return;

        toh(n-1,src,des,hlp);
        System.out.println("Move " + n +" th disc from " + src + " to " + des);
        toh(n-1,hlp,src,des);
    }
}
