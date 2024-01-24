package Lec16;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABAc";
		checkPalindrome(s);
		

	}
	
	public static void checkPalindrome(String str) {
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i)!= str.charAt(j)) {
				System.out.println("Not a palindrome");
				break;
			}
			
			i++;
			j--;
		}
		
		if(i==j)
			System.out.println("Palindrome");
	}

}
