package week5.day1.homeassignment_week5_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectSpecificMethod {
	public ChromeDriver driver;
	@BeforeMethod
	public void precondition() {
	//ChromeDriver driver = new ChromeDriver();
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("dilip@testleaf.com");
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("leaf@2024");
	WebElement Login =driver.findElement(By.xpath("//input[@id='Login']"));
	Login.click();
	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}