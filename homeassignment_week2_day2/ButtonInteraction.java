package week2.day2.homeassignment_week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		//Click on the button with the text ‘Click and Confirm title.’
		WebElement clickbutton= driver.findElement(By.xpath("//span[text()='Click']"));
		clickbutton.click();
		String Title=driver.getTitle();
		//Verify that the title of the page is ‘dashboard.’
		if(Title.equals("Dashboard")) {
			System.out.println("The page title is: "+Title);
		}
		else {
			System.out.println("The page tile is different from Dashboard");
		}
		//Navigate back to the home page
		driver.navigate().back();
		Thread.sleep(3000);
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
		WebElement disbutton=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		boolean status=disbutton.isEnabled();
		System.out.println("Whether the button is enabled: " +status);
		//Find and print the position of the button with the text ‘Submit.’
		WebElement position=driver.findElement(By.xpath("//span[text()='Submit'][1]"));
		Point XYPosition=position.getLocation();
		int Xvalue=XYPosition.getX();
		int Yvalue=XYPosition.getY();
		System.out.println("The position of X button is:"+Xvalue +" & The position of Y button is:"+Yvalue);
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement colorbutton=driver.findElement(By.xpath("//span[text()='Save']"));
		String color=colorbutton.getCssValue("background-color");
		System.out.println("Button color is: "+color);
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement size=driver.findElement(By.xpath("//span[text()='Submit'][1]"));
		int height=size.getSize().getHeight();
		int width=size.getSize().getWidth();
		System.out.println("The height of the button is:"+height +"& The width of the button is:"+width);
		//close the driver
		driver.close();

	}

}
