package Lec28;

public class Dice {

    public static void main(String[] args) {

        printRolls("",4);
    }

    private static void printRolls(String s, int target){

        if(target<=0){

            if(target==0)
                System.out.println(s);

            return;
        }

        for(int i=1;i<=3;i++){

            if(i>target)
                return;

            printRolls(s+i ,target-i);
        }

    }
}
