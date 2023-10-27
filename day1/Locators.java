package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	

	 public static void main(String[] args) {
		
	 ChromeDriver  driver =new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 //tolaunch browser
	 driver.get("http://leaftaps.com/opentaps/control/main");
	  
	 
	 //to find the element
	 
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 
	 //find the element and click on login button
	 
	 driver.findElement(By.className("decorativeSubmit")).click();
	 
	 //verification
	 //to get the title of webpage
	 
	 String title = driver.getTitle(); //ctrl+2
	 System.out.println(title);
	 
	 //find the element clickon CRM/SFA

	// driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.partialLinkText("CRM")).click();
	 
}
}