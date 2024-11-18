package week5.day2.homeassignment_week5_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseTwo extends ProjectSpecificMethod {
	@Test
   	public void testcasetwo() {
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
    			//Enter the Company name as 'TestLeaf'.
    			WebElement cname=driver.findElement(By.xpath("//div[@part='input-text']/descendant::input[@name='CompanyName']"));
    			cname.sendKeys("TestLeaf");
    			//Enter Description as 'Salesforces'.
    			WebElement sales=driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container']/textarea)[2]"));
    			sales.sendKeys("Salesforces");
    			//Select Status as 'Active'
    			WebElement status=driver.findElement(By.xpath("//div[@part='combobox']/descendant::button"));
    			action.moveToElement(status).perform();
    			driver.executeScript("arguments[0].click()", status);
    			WebElement active=driver.findElement(By.xpath("//span[@title='Active']"));
    			active.click();
    			//Click on Save
    			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    			//Verify the Alert message (Complete this field) displayed for Name
    			WebElement aname=driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]"));
    			String message=aname.getText();
    			System.out.println("Alert Message: "+message);
    			//verify
    			if(message.contains("Complete this field.")) {
    				System.out.println("TC-2 completed successfully");
    			}
    			else {
    				System.out.println("TC-2 not completed successfully");

    			}
    }


}
