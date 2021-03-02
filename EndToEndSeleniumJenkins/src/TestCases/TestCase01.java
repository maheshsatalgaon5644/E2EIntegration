package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase01 {
	@Test
	public void ORHMLoginLogout() throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\SBrequirments\\Logfile.txt");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		// Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);// wait for the page

		// Logout
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(2000);

		driver.close();
	}
}
