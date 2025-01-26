package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLoginTest {

	@Test
	public void validLogin() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("samsung Mobiles");
		ele.sendKeys(Keys.ENTER);

		// this is automation code for wms application.

		String title = driver.getTitle();
		System.out.println("Actual page title: " + title);

	}

}
