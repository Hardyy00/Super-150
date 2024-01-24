package Lec33;

public class team {
    public static void main(String[] args) {

        pickTeam("abc","",2);
    }

    private static void pickTeam(String ques,String ans,int n){

        if(ans.length()==n){
            System.out.println(ans);
            return;
        }

        if(ques.length()==0)
            return;

        String rest = ques.substring(1);
        pickTeam(rest,ans+ques.charAt(0),n);
        pickTeam(rest,ans,n);
    }
}
