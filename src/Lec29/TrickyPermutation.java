package Lec29;

public class TrickyPermutation {

    public static void main(String[] args) {

        String ques = "aabaa";
        printPermutations(ques,"");
    }

    private static void printPermutations(String ques,String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        boolean[] visit = new boolean[256];

        for(int i=0;i<ques.length();i++){

            if(visit[ques.charAt(i)])
                continue;

            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            visit[ques.charAt(i)] = true;
            printPermutations(s1+s2,ans+ques.charAt(i));
        }
    }
}
