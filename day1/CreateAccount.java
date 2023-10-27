package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 
 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Create Account")).click();
		 
		 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		 
		 driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		 
		 driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Rehana");
		 
		 driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("M-Site");
		 
		 driver.findElement(By.xpath("//input[@class='inputBox'])[5]")).sendKeys("500000");
		 
		 WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		 
			Select indust=new Select(industry);
			
			indust.selectByVisibleText("Computer Software");
			
			WebElement owner = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
			
			Select ownership= new Select(owner);
			
			ownership.selectByVisibleText("S-Corporation");
			
			WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
			
			Select employ=new Select(source);
			
			employ.selectByValue("LEAD_EMPLOYEE");
			
			WebElement marketing = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
			
			Select market=new Select(marketing);
			
			market.selectByIndex(6);

		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
			
			Select texas=new Select(state);
			
			texas.selectByVisibleText("Texas");
		
			driver.findElement(By.className("smallSubmit")).click();
			
				
			driver.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();
	}
}

			
			
			
			
			
			
			
		 
		 
		
		
		 
		 
		 
		 
		 
		 
		
	