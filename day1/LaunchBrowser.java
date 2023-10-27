package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
	//set up the driver and launch the chromeDriver
		
	 ChromeDriver  driver =new ChromeDriver();
	 
	 //maximize window
	 
	  driver.manage().window().maximize();
	  
	  //Load the URL
	  
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  
	  //to close the current browser
	  
	  driver.close();
	  
	  
	  
}
}