package week1.day1;

public class TwoWheeler {

	public int noOfWheels() {
		return 2;
	}
	
	public float mileage() {
		return 50.1f;
	}
	
	public boolean isPunctured() {
		return false;
	}
	
	public char bikeNameFristLetter() {
		return 'y';
	}
		
	
	public static void main(String[] args) {
		
		TwoWheeler obj = new TwoWheeler();
				
		int noOfWheels = obj.noOfWheels();
		System.out.println(noOfWheels);
		
		float mileage = obj.mileage();
		System.out.println(mileage);
		
		boolean punctured = obj.isPunctured();
		System.out.println(punctured);
		
		
		char bikeNameFristLetter = obj.bikeNameFristLetter();
		System.out.println(bikeNameFristLetter);		
				
	}

}
