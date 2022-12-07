package week1.day1;

public class Mobile2 {

	char mobileLogo = 'I';
	short noOfMobilePiece =9;
	int modelNumber = 14;
	float mobilePrice = 800.2f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		
		Mobile2  obj = new Mobile2();
				
		System.out.println("Mobile Logo is "+ obj.mobileLogo);
		System.out.println("Number of Pieces are "+obj.noOfMobilePiece);
		System.out.println("Model Number is "+obj.modelNumber);
		System.out.println("Mobile Price is $ "+obj.mobilePrice);
		System.out.println("Any Damage in Device "+obj.isDamaged);
				
		

	}

}
