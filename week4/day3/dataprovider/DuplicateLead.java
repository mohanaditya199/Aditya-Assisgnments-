package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BaseClass{
	
	
	
	
	@DataProvider(name="dup")
	public String[][] fetchData() {//row,clo
		String[][] data= new String[2][6];
		
		data[0][0]="amazon";
		data[0][1]="adi";
		data[0][2]="b";
		data[0][3]="adib@123.com";
		data[0][4]="google";
		data[0][5]="shivani";
		
		
		data[1][0]="tcs";
		data[1][1]="adi";
		data[1][2]="m";
		data[1][3]="adim@123.com";
		data[1][4]="hcl";
		data[1][5]="shakthi";
		return data;
	}

	@Test(dataProvider="dup")
	public  void runDuplicateLead(String compn,String fname,String lname,String eid,String compn2,String fname2) {	
	
	
		//click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead tab
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Give values
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compn);

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(eid);
		
		driver.findElement(By.name("submitButton")).click();

		//verify the view leads page
		String title=driver.getTitle();
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("sucessully added lead");
			
			
		}
		
		//Duplicate Lead
				driver.findElement(By.linkText("Duplicate Lead")).click();
				
				//Give new values
				WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
				companyname.clear();
				companyname.sendKeys(compn2);
				
				WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
				firstname.clear();
				firstname.sendKeys(fname2);
				
				driver.findElement(By.name("submitButton")).click();

				//verify the view leads page
				String titles=driver.getTitle();
				if(titles.equals("View Lead | opentaps CRM"))
				{
					System.out.println("sucessully duplicated lead");
				}
				
				
	}
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
