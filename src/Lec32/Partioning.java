package Lec32;

import java.util.ArrayList;

public class Partioning {
    public static void main(String[] args) {

        String s = "nitin";
//        partioning(s,"");
        partioning(s,new ArrayList<>());
    }

    private static void partioning(String ques,ArrayList<String> ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=ques.length();i++){

            String part = ques.substring(0,i);
            if(isPalindrome(part)){
                ans.add(ques.substring(0,i));
                partioning(ques.substring(i),ans);
                ans.remove(ans.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s){

        int i = 0;
        int j = s.length()-1;

        while(i<j){

            if(s.charAt(i)!=s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

//    private static void partioning(String ques,String ans){
//
//        if(ques.length()==0){
//            System.out.println(ans);
//            return ;
//        }
//
//        for(int i=1;i<=ques.length();i++){
//
//            String part = ques.substring(0,i);
//            partioning(ques.substring(i),ans + part + "|");
//        }
//    }
}

