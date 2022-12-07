package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
		driver.findElement(By.xpath("(//div[@id='button']//img)")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[2]")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("222");
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//String  str1 = driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=15934'])[2]")).getText();
		String str1 = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).getText();
		
		System.out.println(str1);
		
		
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		
		//driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='Advanced']/following::input")).sendKeys(str1);
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		
		String dspmsg = driver.findElement(By.className("x-paging-info")).getText();
		
		
		if (dspmsg.equals("No records to display")) 
		{
			System.out.println("record deleted");
		} 
		else 
		{
			System.out.println("record not deleted");		
		}
		
		//driver.close();
		
		
		
	}

}
