package week2.day2.homeassignment_week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize
		driver.manage().window().maximize();
		//login
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click the "Leads" link.
		driver.findElement(By.linkText("Leads")).click();
		//Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on the "Phone" tab
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		//Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//Capture the lead ID of the first resulting lead
		WebElement firstLead=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String FL=firstLead.getText();
		System.out.println("First resulting lead: "+FL);
		//Click the first resulting lead.
		WebElement firstLeadclick=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		firstLeadclick.click();
		//Click the "Delete" button
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		//Click "Find leads." again
		driver.findElement(By.linkText("Find Leads")).click(); 
		//Enter the captured lead ID
		WebElement LeadID=driver.findElement(By.name("id"));
		LeadID.click();
		LeadID.sendKeys(FL);
		///Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);		
		//Verify the presence of the message "No records to display" in the Lead List. 
		//This message confirms the successful deletion. 
		String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(text.equals("No records to display"))
			System.out.println("The Lead ID got deleted");
		else
			System.out.println("Lead ID is present");
		//Close the driver
		driver.close();

	}

}
