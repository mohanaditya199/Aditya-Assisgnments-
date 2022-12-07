package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		boolean boo = false;
		int n = 7;
	
		
		for (int i = 0; i < n; i++) {
			
			if(n%2==0) {
				boo = true;
				break;
			}
			
		}
		if (boo!=true)
		{
			System.out.println("the given no "+ n +" is prime number");
		}
		else
		{
			System.out.println("the given no "+ n +" is not a prime number");
		}
		
	}

}
