import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m  = cin.nextInt();

        int[][] mat = new int[n][m];

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                mat[i][j] = cin.nextInt();
            }
        }

        System.out.println(find(n, m, mat));



    }

    static int find(int n, int m, int[][] mat){

        int[][] pre = new int[m][m];
        int[][] help  = new int[m][m];

        for(int i=0;i<m;i++){

            for(int j=0;j<m;j++){

                if(i==j) pre[i][j] = mat[n-1][i];
                else pre[i][j] = mat[n-1][i] + mat[n-1][j];
            }
        }

        for(int r=n-2;r>=0;r--){

            for(int c1 = 0;c1<m;c1++){

                for(int c2 = 0;c2<m;c2++){

                    int max = 0;

                    for(int i=-1;i<=1;i++){

                        for(int j=-1;j<=1;j++){

                            int pathSum = Integer.MIN_VALUE;

                            if(c1+i>=0 && c1+i<m && c2+j>=0 && c2+j<m){

                                if(c1==c2) pathSum = pre[c1+i][c2+j] + mat[r][c1];
                                else pathSum = pre[c1+i][c2+j] + mat[r][c1] + mat[r][c2];
                            }

                            max = Math.max(max,pathSum);
                        }
                    }

                    help[c1][c2] = max;
                }
            }

            int[][] swap = help;
            help = pre;
            pre = swap;
        }


        return pre[0][m-1];
    }
}