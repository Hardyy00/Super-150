package Lec6;

public class Function2_Demo {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		
		addition(a, b);
	}
	
	public static void addition(int a , int b) {
		
		sub(a , b);
		System.out.println(a+b);
	}
	
	public static void sub(int a , int b) {
		
		System.out.println(a-b);
		
	}
}
