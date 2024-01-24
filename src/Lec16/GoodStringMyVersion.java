package Lec16;

public class GoodStringMyVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String s = "cbaeicde";
//		String s = "aeipaeiozaeiou";
		String s= "heAlloAIeuAk";
		
		System.out.println(checkGoodString(s.toLowerCase()));
	}
	
	public static int checkGoodString(String str) {
		
		String s = "";
		String temp = "";
		
		for(int i=0; i<str.length();i++) {
			
			String sub = str.substring(i, i+1);

			if(checkVowel(sub)) {
				temp += sub;
			}else {
				temp ="";
			}
			
			 if(temp.length()>s.length())
				 s = temp;
			 			
		}
		
		
		return s.length();
    }
	
	public static boolean checkVowel(String sub) {
		
		switch(sub) {
	
			case "a" :
			case "e":
			case "i":
			case "o":
			case "u":
				return true;
			default:
				return false;
			
				
		}
		
		
		
	}

}
