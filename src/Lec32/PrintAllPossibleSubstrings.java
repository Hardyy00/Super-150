package Lec32;

import java.util.ArrayList;

public class PrintAllPossibleSubstrings {
    public static void main(String[] args) {

        String s = "abc";

        breakDown(s,0);

    }

    private static void breakDown(String s,int index){

        if(index==s.length()){
            return;
        }

        for(int i=index;i<s.length();i++){

            System.out.println(s.substring(index,i+1));
            breakDown(s,i+1);
        }
    }
}
