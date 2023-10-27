package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) {
		
		ChromeDriver  driver =new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.partialLinkText("CRM")).click();
		 
		 driver.findElement(By.partialLinkText("Leads")).click();
		 
		 driver.findElement(By.partialLinkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("OSC_LLC");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rehana");
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kadar khan");
		 
	     driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
	     
 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
 
 
	     Select drop= new Select(source);
	     
	     drop.selectByVisibleText("Employee");
	     
	  WebElement  mrkt = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		     
	    Select camp =new Select(mrkt);
	    
	     camp.selectByValue("CATRQ_AUTOMOBILE");
	     
	     WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	     
	     Select corp =new Select(owner);
	     
	     corp.selectByIndex(5);	
	     
	     WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	     
	     Select ind = new Select(country);
	     
	     ind.selectByVisibleText("India");
	     
	     
	     driver.findElement(By.name("submitButton")).click();
	     
	     String title = driver.getTitle();
	     System.out.println(title);
	     
	     
	     
	     //verification
	     //to reteive text from Dompage
	    // String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	  //   System.out.println (firstname);
	     
	    // if(firstname.contains("Rehana")) {
	  //  	 System.out.println("the lead is created");}
	    	// else
	    //	 {
	    		// System.out.println("the Lead is not created");
	    //	 }
	    
	
	     
	     
	}
		
}

