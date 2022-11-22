package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();

		int add = obj.add(2, 4, 6);
		System.out.println(add);
				
			int sub = obj.sub(10, 5);	
			System.out.println(sub);	
				
				
				double mul = obj.mul(30.22, 40.45);
				System.out.println(mul);
				
					float divide = obj.divide(100f, 10f);
					System.out.println(divide);
	}

}
