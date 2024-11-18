package week5.day2.homeassignment_week5_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ProjectSpecificMethod {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void precondition(String Url,String uname,String pwd) {
		//ChromeDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(uname);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pwd);
		WebElement Login =driver.findElement(By.xpath("//input[@id='Login']"));
		Login.click();
	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}