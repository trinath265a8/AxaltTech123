package OperationsOnWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 1. Selecting the Radio Button by Label Text / value 2. Find out number of
 * elements in a radio group 3. Find out all radio button values 4. How to get
 * the selected radio button label text? 5. Check if Radio Button is selected?
 * 6. Check if Radio Button is enabled or disabled?
 */
public class RadioButtonCheckBox {

	@Test
	public void MagnusLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qamagnus.jalatechnologies.com/");

		driver.findElement(By.id("UserName")).sendKeys("trinath5a8@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8121510785");
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Employee")).click();
		driver.findElement(By.linkText("Create")).click();
		driver.findElement(By.id("rdbFemale")).click();

		// 2.It finds the RadioButton Elements and stores them into array
		List<WebElement> l = driver.findElements(By.name("rdbGender"));
		System.out.println(l.size() + " elements" + l);

		// 3.It finds the RadioButton Elements using the xpath and stores them in a list
		List<WebElement> a = driver.findElements(By.xpath("//label[@class='_58mt']"));
		for (WebElement elementText : a)		
		System.out.println(elementText.getText());
		
		
		List<WebElement> a1=driver.findElements(By.xpath("//input[@type='radio']"));		
		for(WebElement elementText : a1)
			if(elementText.isSelected())
				System.out.println("is Selected");        
			else
				System.out.println("Not selected");
		

	}
}