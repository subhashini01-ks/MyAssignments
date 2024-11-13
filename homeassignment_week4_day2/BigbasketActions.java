package week4.day2.homeassignment_week4_day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigbasketActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		//Maximize
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on "Shop by Category"
		WebElement shopbycate=driver.findElement(By.xpath("(//div[@class='relative h-full']/button)[2]"));
		shopbycate.click();
		//Mouse over "Foodgrains, Oil & Masala"
		WebElement foodgrains=driver.findElement(By.xpath("(//li[@class='jsx-1259984711']/a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions action =new Actions(driver);
		action.moveToElement(foodgrains).perform();
		//Mouse over "Rice & Rice Products
		WebElement prod=driver.findElement(By.xpath("(//li[@class='jsx-1259984711']/a[text()='Rice & Rice Products'])[1]"));
		action.moveToElement(prod).perform();
		//Click on "Boiled & Steam Rice"
		WebElement boiled=driver.findElement(By.xpath("(//li[@class='jsx-1259984711']/a[text()='Boiled & Steam Rice'])[1]"));
		boiled.click();
		//Filter the results by selecting the brand "bb Royal"
		WebElement bbroyal=driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		driver.executeScript("arguments[0].click()", bbroyal);//bbroyal.click();
		//Click on "Tamil Ponni Boiled Rice"
		WebElement tamilponni=driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		driver.executeScript("arguments[0].click()", tamilponni);
        //Move to new window
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);
			
		}
		List<String>window = new ArrayList <String>(windowHandles);
		driver.switchTo().window(window.get(1));
		//select the 5 Kg bag
		//WebElement fivekg=driver.findElement(By.xpath("//div[@class='flex justify-start w-full h-full']/descendant::span[text()='5 kg']"));
		//Thread.sleep(2000);
		//driver.executeScript("arguments[0].click()", fivekg);
		//Check and note the price of the rice
		//WebElement price=driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full']/descendant::span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[5]"));
		//String riceprice=price.getText();
		//System.out.println(riceprice);
		//Click "Add" to add the bag to your cart
		WebElement add=driver.findElement(By.xpath("(//button[text()='Add to basket'])[2]"));
		Thread.sleep(2000);
		action.scrollToElement(add).perform();
		driver.executeScript("arguments[0].click()", add);
		//add.click();
		//Verify the success message that confirms the item was added to your cart
		Thread.sleep(2000);
		WebElement success=driver.findElement(By.xpath("//div[@class='Toast___StyledDiv-sc-1uergwq-0 kLrmgR']/descendant::p"));
		String message=success.getText();
		System.out.println(message);
		//Take a snapshot of the current page
		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/image3.png");
		FileUtils.copyFile(src, desc);
		//Close the current window
		driver.close();
		//close the main window
		driver.switchTo().window(window.get(0));
		driver.close();
		

	}

}
