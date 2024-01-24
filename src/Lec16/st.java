package Lec16;

public class st {

	public static void main(String[] args) {
		
		String s = "Hello Boi";
		
		System.out.println(s.charAt(3));
		System.out.println(s.length());			// length() of the string
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(1,1));
		
		String s1 = "Kunal";
		String s2 = "Komal";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(compareTo(s1,s2));
		
		
	}
	
	private static int compareTo(String s1 , String s2) {
		
		int i=0;
		int j=0;
		
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				return s1.charAt(i) - s2.charAt(j);
			}
					
					
		}
		
		return s1.length() - s2.length();
	}

}
