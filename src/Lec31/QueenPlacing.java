package Lec31;

public class QueenPlacing {

    public static void main(String[] args) {

        int n = 4;
        int tq =2;
        boolean[] board = new boolean[n];

        permutation(board,tq,0,"");
    }

    private static void permutation(boolean[] board,int tq,int qpsf,String ans) {                    // qpsf = queen place so far

        if(tq==qpsf){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<board.length;i++){

            if(board[i])
                continue;

            board[i] = true;
            permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
            board[i] = false;           // this undoing is called backtracking
        }

    }
}
