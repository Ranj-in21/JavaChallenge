package javaChallenge;

public class Day1StringLength {

	public void lastword(String name) {
		
		int count = 0;
		
		String[] split = name.split(" ");
		//System.out.println(split.length);
		
			for (int i = 0; i < split.length; i++) {
			
					count++;
			
				if(count==split.length) {
					
					System.out.println("Last word is: " +split[i]);
					
					System.out.println("Length is: " +split[i].length());
					
				}		
		
		}
		

	}
	
	
	
	public static void main(String[] args) {
		
		Day1StringLength obj = new Day1StringLength();
		obj.lastword("Hello World");
		obj.lastword("fly me   to   the moon");
		obj.lastword("luffy is still joyboy");
		obj.lastword("Hi, how are you?");
		obj.lastword("I am learning Java");
		
		
	}

}
