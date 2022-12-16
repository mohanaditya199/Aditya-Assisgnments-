package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public RemoteWebDriver driver;
	
	@Parameters({"browser","url","username","password"} )
	
	@BeforeMethod
	
	public void precondition(String browser, String url, String username, String password) throws InterruptedException {
	
	
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		driver = new ChromeDriver(option);
		
	
	
	driver.get(url);
	
		//Load the url
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		Thread.sleep(3000);


		//inspect user name and send username text
		driver.findElement(By.id("username")).sendKeys(username);

		//inspect password and send password text
		driver.findElement(By.id("password")).sendKeys(password);

		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
	}
	
	
	@AfterMethod
	public void postcondition() {
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
}
