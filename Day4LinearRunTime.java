package javaChallenge;


public class Day4LinearRunTime {
	
	
	public static void main(String[] args) {
		
		
		
		int[] input = {4,1,2,1,2};
	//	int[] input = {2,2,1};
		
		int num = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			
			num = num ^ input[i];
		}
		System.out.println("The number that appears once: " +num);
		
		
	}	

	

}
