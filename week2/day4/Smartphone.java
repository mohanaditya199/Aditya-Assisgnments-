package week2.day4;

public class Smartphone extends IPhone implements Mobile {

	

	@Override
	public void takeVideo() {
		System.out.println("video taken");
		
	}

	public void MakeCall() {
		System.out.println("call made");
		
	}

	public void SendMessage() {
		System.out.println("msg sent");
		
	}

	public void SendEmail() {
		System.out.println("email sent");
		
	}

	public void TakePhoto() {
		System.out.println("Photo taken 2");
	}
	
public static void main(String[] args) {

		
	Smartphone obj = new Smartphone();
		
		obj.MakeCall();
		obj.SendMessage();
		obj.SendEmail();
		obj.takeVideo();
		obj.TakePhoto();
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
