package week1.day3;

import java.util.Arrays;

public class FindIntersection {

	public static void main(LearningString[] args) {
		int [] num1 = {3,2,11,4,6,7};
		int [] num2 = {1,2,8,4,9,7};
		
		int length1 = num1.length;
		//System.out.println(length1);
		
		
		int length2 = num2.length;
		//System.out.println(length2);
		
		
		
		for (int i = 0; i < num1.length; i++) {
			//System.out.println(num1[i]);
		
			for (int j = 0; j < num2.length; j++) {
				//System.out.println(num2[j]);
				
				if (num1[i]==num2[j]) {
					System.out.println(num1[i]);
				} 
				
			}
		}
		
		
		
		
		
		
	}

}
