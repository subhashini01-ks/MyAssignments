package week2.day1.homeassignment_week2_day1_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//click on create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the company name
		WebElement CompanyName=driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("ABC test company");
		//Enter the first name
		WebElement FirstName=driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Subha");
		//Enter the last name
		WebElement LastName=driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("K");
		//Enter the Title
		driver.findElement(By.name("generalProfTitle")).sendKeys("samurai company");
		//Click on create lead
		driver.findElement(By.className("smallSubmit")).click();
		//To verify the entered title
		String text=driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println("The Entered title is:"+text);
		//close the browser
		driver.close();

	}

	
	}


