package Lec33;

// Very Famous Question

public class PlaceQueens2D {

    public static void main(String[] args) {
        placeQueens(0,0,3,3,2,"");
    }

    private static void placeQueens(int i,int j,int m,int n,int qtp,String ans){

        if(qtp==0){
            System.out.println(ans);
            return;
        }

        if(i==m*n && j==m*n)
            return;

        int a = i/m , b = j%n;

        placeQueens(i+1,j+1,m,n,qtp-1, (ans +"("+a + "," + b +")" + " "));
        placeQueens(i+1,j+1,m,n,qtp,ans);
    }
}
