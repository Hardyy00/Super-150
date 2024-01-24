public class PowerSet {

    public static void main(String[] args) {

        String s ="abcde";

        int t =(int)Math.pow(2,s.length());

        for(int i=0;i<t;i++){

            StringBuilder ans = new StringBuilder();

            for(int j=0;j<s.length();j++){

                if((i&(1<<j))!=0){
                    ans.append(s.charAt(j));
                }
            }
            System.out.println(ans.toString());
        }

    }
}
