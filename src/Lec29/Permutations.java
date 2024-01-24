package Lec29;

import javax.swing.plaf.IconUIResource;

public class
Permutations {

    public static void main(String[] args) {

        String s = "abc";
        boolean[] visit = new boolean[s.length()];
        printPermuatations(s,"",visit);
    }

    private static void printPermuatations(String s,String ans ,boolean[] visit){

        if(ans.length() == s.length()){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){

            if(visit[i])
                continue;

            visit[i] = true;
            printPermuatations(s,ans+s.charAt(i),visit);
            visit[i] = false;
        }
    }
}
