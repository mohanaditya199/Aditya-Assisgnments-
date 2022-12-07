package week2.day3;

public class Calculator {

	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	
	public double sub(double a,double b) {
		return a-b;
	}
	
	public int sub(int a,int b, int c) {
		return a-b-c;
	}
	
	public void mul(int a,double b) {
	       System.out.println(a*b);
	}
	public double mul(double a,double b) {
		return a*b;
	}
	
	
	public static void name() {
		
	}
	
	
	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		
		int add1 = cal.add(2, 4);
		System.out.println(add1);
		int add2 = cal.add(2, 4, 6);
		System.out.println(add2);
		double sub1 = cal.sub(5.55, 2.22);
		System.out.println(sub1);
		int sub2 = cal.sub(10, 3, 2);
		System.out.println(sub2);
		cal.mul(2, 5.42);
		double mul1 = cal.mul(6.45, 5.26);
		System.out.println(mul1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
