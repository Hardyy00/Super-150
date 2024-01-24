package Lec20;

public class FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {54,546,548,60};
		String s = "";
		
		sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			s+= arr[i];
		}
		
		System.out.println(s);
		

	}
	
	private static void sort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-i;j++) {
				
				if(compare(arr[j],arr[j+1])>0) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	private static long compare(int x , int y) {
		
		String xy = "" + x+ y;
		String yx = ""  + y + x;
		
		return Long.parseLong(yx) - Long.parseLong(xy); 
	}

}
