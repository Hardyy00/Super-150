package Lec29;

public class PrintPath {

    public static void main(String[] args) {

        System.out.println(findPaths(0,0,"",3,4));
    }

    private static int findPaths(int i,int j,String path,int r,int c){

        if(i== r-1 && j== c-1){
            System.out.println(path);
            return 1;
        }
        int count = 0;

        if(i+1 < r){
            count +=findPaths(i+1,j,path + "V",r,c);

        }

        if(j+1< c){
            count +=findPaths(i,j+1,path + "H",r,c);
        }


        // approx 10^4 call stack can be made
        return  count;

    }
}
