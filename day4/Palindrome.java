package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		String rev = "";
		
		System.out.println(str.length());
		
		
		char[] charArray = str.toCharArray();
		
		
		
		for (int i = charArray.length-1; i >= 0; i--) {
			
			//System.out.println(charArray[i]);
			
			rev=rev+charArray[i];
			
		}
		
		
		System.out.println(rev);
		
		if (str.equals(rev)) 
		{
		System.out.println("it is palindrome");
		} 
		
		else {System.out.println("not a palindrome");

		}
		
		

	}

}
