package Lec35;

public class PalindromicSubstrings {

    public static void main(String[] args) {

        String s = "aaa";
        System.out.println(countPalindrome(s));
    }

    public static int countPalindrome(String s){

        int count = 0;
        // odd  (substrings of odd length are checked)
        for(int axis=0;axis<s.length();axis++){

            for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
                if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
                    break;
                }
                count++;
            }
        }

        // even (substrings of even length are checked)
        for(double axis=0.5;axis<s.length();axis++){

            for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                    break;
                }
                count++;
            }
        }

        return count;
    }
}
