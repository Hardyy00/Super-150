package Lec29;

public class PermutationBhaiya {

    public static void main(String[] args) {

        String ques = "hard";
        printAnswer(ques,"");
    }

    private static void printAnswer(String ques, String s) {

        if(ques.length()==0){
            System.out.println(s);
            return;
        }

        for(int i=0;i<ques.length();i++){
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            printAnswer(s1+s2,s+ques.charAt(i));
        }
    }


}
