package Lec20;

public class ReverseString {

	public static void main(String[] args) {
		String s = "a good   example";
		System.out.println(reverseWords(s));		// removes string from after and before of a string

	}
	
	public static String reverseWords(String s) {
		
		s = s.trim();
        String[] str = s.split("\s+");		// \s+ is regex to remove multiple spaces not one
        String ans = "";
        
        for(int i=str.length-1;i>=0;i--) {
        	ans += str[i]+ " ";
        }
        
        return ans.trim();
    }

}
