package Lec33;

public class PlaceQueens {

    public static void main(String[] args) {

        placeQueens(0,2,4,"");
    }

    private static void placeQueens(int index,int qtp,int length,String ans){

        if(qtp==0){
            System.out.println(ans);
            return;
        }

        if(index>=length)
            return;

        placeQueens(index+1,qtp-1,length,ans+"Q" + index);
        placeQueens(index+1,qtp,length,ans);
    }

}
