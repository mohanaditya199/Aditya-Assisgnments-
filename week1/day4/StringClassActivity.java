package week1.day4;

public class StringClassActivity {

	public static void main(String[] args) {
		
		String str = new String ("Test Leaf");
		
		
		char[] charArray = str.toCharArray();
		
		
		for (int i = charArray.length-1; i >=0; i--) {
			
			
			System.out.println(charArray[i]);
			
		}
		
		
		

	}

}
