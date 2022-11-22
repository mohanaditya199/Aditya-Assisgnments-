package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 4;
		int b = 0;
		
		for (int i = 2; i <n-1; i++) {
			
			if(n%i==0) {
				b=b + 1;
			}
			
		}
		if (b>1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
		
	}

}
