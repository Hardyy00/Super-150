package Lec10;

public class GasStation {
	
	public static void main(String[] args) {
		
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		
		System.out.println(completeCircuit(gas, cost));
	}
	
	public static int completeCircuit(int[] gas , int[] cost) {
		
		int tc = 0;
		int curr = 0;
		int si = 0;
		for(int i=0;i<cost.length;i++) {
			
			tc = tc + gas[i] - cost[i];
			curr += gas[i] - cost[i];
			
			if(curr<0) {
				curr = 0;
				si = i+1;
			}
		}
		
		
		if(tc<0)
			return -1;
		
		return si;
	}
}