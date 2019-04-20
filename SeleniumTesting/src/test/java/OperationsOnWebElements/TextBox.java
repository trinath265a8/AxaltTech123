package OperationsOnWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**1. How to Type in text box using Selenium Web Driver
2. How to get a Text Box value using Selenium Web Driver
3. How to read the placeholder value of a Text Box using getAttribute() method
4. Deleting/clear text from the Text Box
5. Check if Text Box is enabled/disabled*/
public class TextBox {

	
	@Test
	public void MagnusOpen() {
		// Setting the path of the Chrome Webdriver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		
		//Creating an object for the Chrome Webdriver
		WebDriver driver =new ChromeDriver();
		
		//Deleting all the cookies
		driver.manage().deleteAllCookies();
		
		//It is used to set the browser window size to fullscreen
		driver.manage().window().maximize();
		
		//This is used to open the url in the Browser
		driver.get("http://qamagnus.jalatechnologies.com/");
		
		
		WebElement ele=driver.findElement(By.id("UserName"));
		           ele.sendKeys("trinath5a8@gmail.com"); //1
		           System.out.println(ele.getAttribute("value")); //2 
		           System.out.println(ele.getAttribute("placeholder")); //3
		           ele.clear();//4
		           if(ele.isEnabled()) //5
		           System.out.println("Text Box is enabled");
		           else
		        	   System.out.println("Tesxt Box is disabled");
		driver.close();
		
		
	}
	
	}


