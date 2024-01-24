package Lec6;

public class Function3_Demo {
	
	static int val = 100;					// Global Variable -> Created in Heap

 public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		
		System.out.println(addition(a, b));
		System.out.println(val);
	}
	
	public static int addition(int a , int b) {
		
		sub(a , b);
		return a+b;
	}
	
	public static int sub(int a , int b) {
		
		int val= 90;
		Function3_Demo.val = val + 5;
		return a-b;
	}

}
