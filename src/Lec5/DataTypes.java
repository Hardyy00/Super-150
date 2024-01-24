package Lec5;

public class DataTypes {

	public static void main(String[] args) {
	
		byte b = (byte)(428);
		int i=10;
		long l= 10;
		short s = 10;
		b = (byte)(i);
		System.out.println(b);
		l = s;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		double d = 2.33;
		float f = 2.33f; // always use f or F;
		boolean bool = false;
		
		char c = 'a';
		System.out.println((int)(c));
		c++;					// c = (char) (c+1);
		System.out.println(c); // whenever ++ is used implicit typecasting occurs
		
		int in = Integer.MAX_VALUE;
		in++;
		System.out.println(in);
		

	}

}
