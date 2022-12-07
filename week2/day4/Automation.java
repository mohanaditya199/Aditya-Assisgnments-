package week2.day4;

public class Automation extends MultipleLangauge implements Language,TestTool{

	
public void Selenium() {
	
	System.out.println("prints Selenium" );
}

public void Java() {
	System.out.println("prints Java" );
	
}

@Override
public void ruby() {
	System.out.println("prints ruby" );
	
}
	
public void python(){
	
	System.out.println("prints python 2" );
}	
	



	public static void main(String[] args) {
		
		
		Automation obj = new Automation();
		
		
		obj.Selenium();
		obj.Java();
		obj.ruby();
		obj.python();
		
		
		
		
		
		

	
		
	
		
	}

}
