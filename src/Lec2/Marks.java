package Lec2;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		int marks = cin.nextInt();	
		
		String grade="Fail";
		
		if(marks>=75) {
			grade = "A";
		}else if(marks>=65) {
			grade = "B";
		}else if(marks >=55) {
			grade = "C";
		}else if(marks>=45) {
			grade = "D";
		}
			
		System.out.println(grade);

	}

}
