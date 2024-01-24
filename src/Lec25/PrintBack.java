package Lec25;

public class PrintBack {
    public static void main(String[] args) {

        int n = 5;

        print(n);
    }

    private static void print(int n){
        if(n<1)
            return;

        System.out.println(n);
        print(n-1);
    }
}
