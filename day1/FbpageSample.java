package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbpageSample

{
	public static void main(String[] args) {
		
		ChromeDriver  driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gems.ae/");
		
		 driver.findElement(By.linkText("Find a School")).click();
	}

}
