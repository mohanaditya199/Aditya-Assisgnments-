package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateNewOpportunity extends BasicClass{
	
	@DataProvider(name="opp")
	public String[][] fetchData() {//row,clo
		String[][] data= new String[2][3];
		
		data[0][0]="aditya";
		data[0][1]="1000";
		data[0][2]="advance";
		
		
		
		
		data[1][0]="viji";
		data[1][1]="5000";
		data[1][2]="verify";
		
		return data;
	}

	@Test(dataProvider="opp")
	public void CreNewOpp(String oppname,String amount, String nstep) throws InterruptedException {
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
	
		WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunity);
		Thread.sleep(3000);
	
	
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
		name.sendKeys(oppname);
		String text = name.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(amount);
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys(nstep);
		
		
		
		WebElement date = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		driver.executeScript("arguments[0].click();", date);
		
		Thread.sleep(3000);
		WebElement today = driver.findElement(By.xpath("//button[text()='Today']"));
		driver.executeScript("arguments[0].click();", today);
		
		
		
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		
		driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		WebElement savemsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]"));
		
		String text2 = savemsg.getText();
		System.out.println(text2);
		
		if (text2.contains(oppname)) {
				System.out.println("opp created sucessfully");
		} else {
			System.out.println("opp not created sucessfully");
		}
		
	}
}
