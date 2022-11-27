package week1.day4;

import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		
		String test = "I am a software tester";
		
		
		String[] split = test.split(" ");
		
		
		char[] charArray = test.toCharArray();
		
		
		for (int i = 0; i < charArray.length; i++) {
			
			
			if (i+1%2==0) {
				
				char[] charArray2 = split[i].toCharArray();
				
				for (int j = charArray2.length-1; j >= 0; j--) {
					
					
					System.out.println(charArray2[j]);
					
				}
				
				}
			
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
