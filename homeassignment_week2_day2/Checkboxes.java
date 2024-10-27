package week2.day2.homeassignment_week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// Initializing the driver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://leafground.com/checkbox.xhtml");
		//Maximize
		driver.manage().window().maximize();
		//Click on the Basic check box -- Parent to child
		driver.findElement(By.xpath("//div[contains(@class,'selectbooleancheckbox')]/div[2]")).click();
		//Click on the Notification check box ---- Parent to child
		driver.findElement(By.xpath("(//div[contains(@class,'selectbooleancheckbox')]/div)[4]")).click();
		//Verify that the expected message is displayed
		Thread.sleep(2000);
		String status=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("The status of the checkboxes are: " +status);
		//Click on your favorite language
		//Java - Elder sibling to younger sibling
		driver.findElement(By.xpath("(//div[contains(@class,'hidden-accessible')]/following-sibling::div)[14]")).click();
		//Javascript  --Elder sibling to younger sibling
		driver.findElement(By.xpath("(//div[contains(@class,'hidden-accessible')]/following-sibling::div)[16]")).click();
		//Click on the Tri-State Check box --parent to child
		WebElement checkselect=driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]/div[2]"));
		checkselect.click();
		boolean triselect=checkselect.isSelected();
		System.out.println("Whether triselect is selected: "+triselect);
		Thread.sleep(2000);
		//Verify which tri-state option has been chosen
		Thread.sleep(3000);
		String option=driver.findElement(By.xpath("//div[@class='ui-growl-message']//child::p")).getText();
		System.out.println("Status option is: "+option);
		//Click on the Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']/div[2]")).click();
		//Verify that the expected message is displayed
		Thread.sleep(2000);
		String statusmessage=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("The status of the checkboxes are: " +statusmessage);
		//Verify if the Check box is disabled
		WebElement disabledbox=driver.findElement(By.xpath("//*[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled\"]"));
		Thread.sleep(2000);
		boolean checkboxstatus=disabledbox.isSelected();
		System.out.println("The status of checkbox enablement: "+checkboxstatus);
		 // Select multiple options on the page WebElement
		 WebElement multidrop=driver.findElement(By.xpath("//div[@class='ui-helper-hidden']/following-sibling::div"));
		 multidrop.click(); 
		 
		/* <WebElement> listofoption=driver.findElements(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']/li")); 
		 int size=listofoption.size(); System.out.println(size);*/
		 
		//Select multiple options on the page/
		driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::div)[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::div)[32]")).click();
		//close the option page
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		//Get the entered options
		String Text1=driver.findElement(By.xpath("//span[@class='ui-selectcheckboxmenu-token-label']")).getText();
		System.out.println("The 1 st selected country: "+Text1);
		String Text2=driver.findElement(By.xpath("(//span[@class='ui-selectcheckboxmenu-token-label'])[2]")).getText();
		System.out.println("The 2 nd selected country: "+Text2);
		//close the driver
		driver.close();
	}



}

