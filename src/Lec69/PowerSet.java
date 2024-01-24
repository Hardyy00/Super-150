package Lec69;

public class PowerSet {

    public static void main(String[] args) {

        String s = "abc";

        int tot = 1 << s.length();  // total size

        // here each number represents a unique combination, so if the ith bit of current number is 1, then
        // add the character to the current subsequence

        for(int i=0;i<=tot;i++){

            StringBuilder build = new StringBuilder();

            for(int j=0;j<s.length();j++){
                
                if((i & (1 << j)) != 0){
                    build.append(s.charAt(j));
                }
            }

            System.out.println(build);
        }
    }
}
