package week4.day1.homeassignment_week4_day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//login
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of the "From Contact
		String oldwin=driver.getWindowHandle();
		WebElement from=driver.findElement(By.xpath("//img[@alt='Lookup'][1]"));
		from.click();
		System.out.println(oldwin);
		//switching to new window
		Set<String> windowHandles = driver.getWindowHandles();//step 1- get all the window handle
		for (String string : windowHandles) {
			System.out.println(string);

		}
		List<String> window = new ArrayList <String>(windowHandles);//Step 2- Convert the set into list 
		driver.switchTo().window(window.get(1));//Step 3- Transfer the control to new window
		//Click on the first resulting contact.
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//Click on the widget of the "To Contact"
		driver.switchTo().window(oldwin);
		WebElement to=driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));
		to.click();
		//switching to new window
		Set<String> windowHandles2 = driver.getWindowHandles();//step 1- get all the window handle
		for (String string : windowHandles2) {
			System.out.println(string);

		}
		List<String> window2 = new ArrayList <String>(windowHandles2);//Step 2- Convert the set into list 
		driver.switchTo().window(window2.get(1));//Step 3- Transfer the control to new window
		//Click on the second resulting contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		//switch to parent window
		driver.switchTo().window(oldwin);
		Thread.sleep(2000);
		//Click on the Merge button.
		WebElement merge=driver.findElement(By.linkText("Merge"));
		merge.click();
		//Accept the alert.
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//Verify the title of the page.
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Merge Contacts | opentaps CRM")) {
			System.out.println("Assignment completed successfully");

		}
		else {
			System.out.println("Assignment not completed successfully");

		}
		//close;
		driver.close();


	}

}
