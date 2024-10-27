package week2.day2.homeassignment_week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize
		driver.manage().window().maximize();
		//login
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
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
		//Enter the FirstName (Local) Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("localname");
		//Enter the Department Field Using any Locator of Your Choice
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		//Enter the Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Desc");
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abcsam@test.com");
		//Select State/Province as NewYork Using Visible Text.
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select st=new Select(state);
		st.selectByVisibleText("New York");
		//Click on the Create Button.
		driver.findElement(By.className("smallSubmit")).click();
		//Click on the edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//Clear the Description Field.
		WebElement cleardesc=driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
		cleardesc.clear();
		//Fill the Important Note Field with Any text
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Highly Important");
		//Click on the update button.
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		//Get the Title of the Resulting Page
		Thread.sleep(2000);
		String Title=driver.getTitle();
		if(Title.equals("View Lead | opentaps CRM")) {
			System.out.println("The tiltle of the webpage is: "+Title);
			driver.close();
		}
		else{
			System.out.println("It is not the destination page");
			driver.close();
		}
	}
	}
	


