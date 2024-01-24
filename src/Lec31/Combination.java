package Lec31;

public class Combination {

    public static void main(String[] args) {

        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        permutation(board,tq,0,"",0);
    }

    private static void permutation(boolean[] board,int tq,int qpsf,String ans,int index) {                    // qpsf = queen place so far

        if(tq==qpsf){
            System.out.println(ans);
            return;
        }

        for(int i=index;i<board.length;i++){

            if(board[i])
                continue;

            board[i] = true;
            permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ",i+1);
            board[i] = false;           // this undoing is called backtracking
        }

    }
}
