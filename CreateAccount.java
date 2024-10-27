package week2.day1.homeassignment_week2_day1_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		//click on accounts tab
		driver.findElement(By.xpath("//a[text()=\"Accounts\"]")).click();
		//click on create account button
		driver.findElement(By.xpath("//a[text()=\"Create Account\"]")).click();
		//Enter an account name
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("sherlin");
		//Enter an description
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");
		//Select "ComputerSoftware" as the industry
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select ind=new Select (industry);
		ind.selectByIndex(4);
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select own=new Select(ownership);
		own.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select emp=new Select(source);
		emp.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
		Select mar=new Select(marketing);
		mar.selectByIndex(7);
		//Select "Texas" as the state/province using SelectByValue
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st=new Select(state);
		st.selectByValue("TX");
		//Click the "Create Account" button.
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		//Verify that the account name is displayed correctly
		String acc=driver.findElement(By.xpath("//span[text()='Account Name']/following::span")).getText();
		System.out.println("Account name is:" +acc);
		//close the driver
		driver.close();
	}

}
