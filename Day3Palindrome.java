package javaChallenge;

public class Day3Palindrome {
	
	
	public void Palindrome(String name) {
		
		
		boolean palindrome = true;
		boolean notpalindrome = false;
		String rev = "";
		String str = name.replaceAll("[^a-zA-Z0-9]", "");
		String lower = str.toLowerCase();
		//System.out.println(lower);
		
			for (int i = lower.length()-1; i >= 0; i--) {
				rev = rev + lower.charAt(i);
				
			}
			//System.out.print(rev);
			
			if(rev.equals(lower)) {
				
				System.out.println("Is " +name + " palindrome? "+palindrome);
				
			}else
			{
				System.out.println("Is " +name + " palindrome? "+notpalindrome);
				
			}
			

	}

	public static void main(String[] args) {
		
		Day3Palindrome pal = new Day3Palindrome();
		pal.Palindrome("A man, a plan, a canal: Panama");
		pal.Palindrome("race a car");
		pal.Palindrome(" ");
		pal.Palindrome("Was it a car or a cat I saw?");
		pal.Palindrome("Noel sees Leon");
		
		
		
		
		
		
		
		
		
		

	}

}
