package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion 
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","./SK/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Facebook – log in or sign up");
		driver.findElement(By.id("email")).sendKeys("like u");
	
	}

}
