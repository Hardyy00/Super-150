package Lec18;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.size());
		System.out.println(list);
		
		// add method
		list.add(0,60);				// Index size 0 to size
		System.out.println(list);
		
		// remove() method
		System.out.println(list.remove(0));	// Index 0 to size-1;
		System.out.println(list);
		list.add(4);
		list.add(5);
		
		// get() method
		System.out.println(list.get(1));
		System.out.println(list);
		
		// set() method
		System.out.println(list.set(0, 0));
		System.out.println(list);
		
		

	}

}
