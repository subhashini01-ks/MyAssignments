package week4.day2.homeassignment_week4_day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActions {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Maximize
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search for "oneplus 9 pro"
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("oneplus 9 pro");
		//Enter key
		searchbox.sendKeys(Keys.ENTER);
		//Get the price of the first product --(//span[@class='a-price']/span)[1]
		WebElement price=driver.findElement(By.xpath("(//span[@class='a-price']/descendant::span[@class='a-price-whole'])[1]"));
		String mobprice = price.getText();
		System.out.println("The price of the 1 st resulting mobile is: "+mobprice);
		//Print the number of customer ratings for the first displayed product
		WebElement stars=driver.findElement(By.xpath("(//div[@class='a-row a-size-small']/span[contains(@aria-label,'rating')])[1]"));
		String starstext=stars.getAttribute("aria-label");
		System.out.println("Stars provided by customer: "+starstext);
		WebElement rating=driver.findElement(By.xpath("(//div[@class='a-row a-size-small']/descendant::span[contains(@aria-label,'ratings')])[1]"));
		String ratingtext=rating.getText();
		System.out.println("Customer ratings: "+ratingtext);
		//Click the first text link of the first image
		System.out.println("Title of the page: "+driver.getTitle());
		WebElement firstlink=driver.findElement(By.xpath("//div[@data-cy='title-recipe']/descendant::a[1]"));
		firstlink.click();
		//Transfer the driver control to new window
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);	
		}
		List<String> window = new ArrayList <String>(windowHandles);
		driver.switchTo().window(window.get(1));
		//Take a screenshot of the product displayed
		//WebElement productsnap=driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/image1.png");
		FileUtils.copyFile(src, desc);
		//Click the 'Add to Cart' button
		WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
		//Get the cart subtotal and verify if it is correct.
		WebElement carttotal=driver.findElement(By.xpath("//div[@class='a-row a-spacing-none']/descendant::span[@class='a-size-base-plus a-color-price a-text-bold']"));
		String carttotalprice = carttotal.getText();
		System.out.println("Cart total is: "+carttotalprice);
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
		WebElement subtotal=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']"));
		String subtotalprice=subtotal.getText();
		System.out.println("Cart subtotal is: "+subtotalprice);
		if(subtotalprice.contains(carttotalprice.substring(2, 10))) {
			System.out.println("It is correct");
		}
		else
			System.out.println("It is not correct");
		//close the driver
		driver.quit();


	}

}
