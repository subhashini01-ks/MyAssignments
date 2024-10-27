package week2.day1.homeassignment_week2_day1_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on create account button
		driver.findElement(By.linkText("Create Account")).click();
		//Enter the account name
		driver.findElement(By.id("accountName")).sendKeys("Pranitha");
		//Enter the description
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");
		//Enter the no.of employees
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		//Enter the site name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//click on create account
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		//get the title of the page
		String title=driver.getTitle();
		System.out.println("page title is: "+title);
		//close the driver
		driver.close();
		

	}

}
