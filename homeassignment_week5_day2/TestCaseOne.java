package week5.day2.homeassignment_week5_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCaseOne extends ProjectSpecificMethod {
    @Test(dataProvider="senddata")
	public void testcaseone(String yourname) {
		//Click on the toggle menu button from the left corner
		WebElement toggle=driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click();
		//Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement LegEnt=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions action=new Actions(driver);
		action.moveToElement(LegEnt).perform();
		LegEnt.click();
		//Click on the Dropdown icon in the legal Entities tab
		WebElement drop=driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset']/descendant::lightning-primitive-icon[@exportparts='icon'])[5]"));
		driver.executeScript("arguments[0].click()", drop);
		//Click on New Legal Entity
		WebElement nle=driver.findElement(By.xpath("//span[@class='slds-truncate']/descendant::span[text()='New Legal Entity']"));
		driver.executeScript("arguments[0].click()", nle);

		//Enter Name as 'Salesforce Automation by *Your Name*'
		WebElement name=driver.findElement(By.xpath("//div[@part='input-text']/descendant::input[@name='Name']"));
		name.sendKeys(yourname);
		//Click save and verify Legal Entity Name
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement verify=driver.findElement(By.xpath("(//div[@class='slds-form-element__control']/descendant::lightning-formatted-text)[1]"));
		String txt=verify.getText();
		System.out.println(txt);
		if(txt.contains("Salesforce Automation by")){
			System.out.println("TC-1 completed successfully");

		}else
		{
			System.out.println("TC-1 not completed successfully");
		}
	}
    
    @DataProvider
    public String[][] senddata() {
    	String [][]data = new String[2][1];
    	data[0][0]="Salesforce Automation by Subhashini";
    	data[1][0]="Salesforce Automation by Priya";
    	return data;
    }
    
}
