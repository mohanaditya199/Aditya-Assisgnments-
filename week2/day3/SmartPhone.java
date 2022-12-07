package week2.day3;

public class SmartPhone extends Android{
	
	

	public void ConnectWatsapp() {
		System.out.println("can connect watsapp");

	}
	
	public void TakeVideo() {
		System.out.println("can take videos smart phone");

	}
	
	
	
	public static void main(String[] args) {
		SmartPhone sp  =new SmartPhone();
		
		sp.SendMsg();
		sp.MakeCall();
		sp.SaveContact();
		sp.TakeVideo();
		sp.ConnectWatsapp();
		
			
		
		
	}

}
