package Lec20;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		//sb will be created in stack		// new StringBuilder() will be created in Heap
		
		System.out.println(sb.length());		// will give the size of builder
		
		sb.append('c');
		System.out.println(sb.capacity());      // Initial Capacity is 16	// After adding capacity will increase
		StringBuilder sb1 = new StringBuilder();		// will increase by (old_capacity * 2 + 2)
		
		sb.append("Bye");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append("HelloBhelo1");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append('a');
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.insert(1, "ll");
		System.out.println(sb);
		String s = sb.toString();	// builder to string
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(1,3));
		
	}	
	

}
