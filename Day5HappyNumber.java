package javaChallenge;

import java.util.Set;
import java.util.TreeSet;

public class Day5HappyNumber {
	
	public static boolean IsHappyNum(int n) {
		
		Set<Integer> numbers = new TreeSet<Integer>();
		
		while(n != 1) {
			
			int result = n;
			int sum = 0;
			
			while(result != 0) {
				
				int rem = result % 10;
				sum = sum + (rem*rem);
				result = result/10;	
			
			}
			if(numbers.contains(sum)) {
				
				return false;
				
			}
			n = sum;
			numbers.add(n);
			
			
		}
		return true;		
		
		
	}
		
		
	public static void main(String[] args) {
	
		int num = 139;
		System.out.println(IsHappyNum(num));
	

	}

}
