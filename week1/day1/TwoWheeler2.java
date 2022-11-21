package week1.day1;

public class TwoWheeler2 {

	int noOfWheels = 2;
	float mileage = 40.2f;
	boolean isPunctured = false;
	char bikeNameFristLetter = 's';
	
	
	public static void main(String[] args) {
		
		TwoWheeler2 obj = new TwoWheeler2();
		
		System.out.println("my bike has wheels "+ obj.noOfWheels);
		System.out.println("my bike mileage is  "+ obj.mileage);
		System.out.println("my bike is punctured  "+ obj.isPunctured);
		System.out.println("my bike first name is  "+ obj.bikeNameFristLetter);
	}

}
