package week1.day3;


import java.util.Arrays;



public class MissingElementInAnArray {

	public static void main(LearningString[] args) {
	
		int[] arr = {1,2,3,4,7,6,8};
		
		
		//int length1 = arr.length;
				//System.out.println(length1);
		
		
		
		Arrays.sort(arr);
		
		for (int i = arr[0]; i < arr.length; i++) {
			//System.out.println(arr[i]);
			
			if (arr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
			
			
			
			
		}
		
	
		
		
		
		
		
		

	}

}
