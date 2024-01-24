package Lec27;

import java.util.ArrayList;

public class FindSubsequence {

    public static void main(String[] args) {

        StringBuilder st = new StringBuilder();

        System.out.println(findSubsequence(0,st,"abc"));

    }

    private static int findSubsequence(int index,StringBuilder st,String s){

        if(index==s.length()) {
            return 1;
        }

        st.append(s.charAt(index));
        int a = findSubsequence(index+1,st,s);

        st.deleteCharAt(st.length()-1);
        int b = findSubsequence(index+1,st,s);

        return a+b;
    }
}
