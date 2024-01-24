package Lec18;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer a = 10;			// 10 will formm in heap and then address is initialized in stack
		int a1 = 10;			// both a1 and 10 a

		
		a=a1; // value of a1 is formed somewhere in the heap and then is initialized to a;		// primitive -> non pri AutoBoxing
		int b = -6;
		Integer b1 = -9009;
		b = b1;		// non
		
		Integer c1 = 10;		
		Integer c2 = 10;
		Integer c3 = 178;
		Integer c4 = 178;
		
		System.out.println(c1==c2);		// c1 and c2 have same memory address bcuz the range is between -128 and 127
		System.out.println(c3==c4);		// c3 and c4 are not equal because the 178 is out of range so both are formed at different locations
		
		
		// For Integer, Long and Short if the range is b/w -128 to 127 then  no duplicate is formed in heap memory.
		
	}

}
