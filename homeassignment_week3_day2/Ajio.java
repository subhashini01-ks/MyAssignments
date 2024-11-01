package week3.day2.homeassignment_week3_day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//Under "Category" click "Fashion Bags"
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//Print the count of the items found.
		Thread.sleep(2000);
		WebElement items=driver.findElement(By.xpath("//div[@class='length']"));
		String count=items.getText();
		System.out.println("Items :"+count);
		//Get the list of brand of the products displayed in the page and print the list
		List<WebElement> Brandname = driver.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']//descendant::div[@class='brand']"));
		int Brandnamecount=Brandname.size();
		System.out.println("The number of Brandname is: "+Brandnamecount);
		for (WebElement Brand : Brandname) {
			String txt1=Brand.getText();
			System.out.println(txt1);
			
		}
		System.out.println("........................................................");
		List<WebElement> Bagname = driver.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']//descendant::div[@class='nameCls']"));
		for (WebElement bags : Bagname) {
			String txt2=bags.getText();
			System.out.println(txt2);
			
		}
//		driver.findElement(By.xpath("//span[text()='brands']")).click();
//		driver.findElement(By.xpath("//div[@id='verticalsizegroupformat-brand']")).click();
//		List<WebElement> brands=driver.findElements(By.xpath("//li[@class='rilrtl-list-item']//descendant::span[@class='facet-list-title-name']"));
//		int brandsize=brands.size();
//		System.out.println(brandsize);
//		for (WebElement brandnames : brands) {
//			String txt=brandnames.getText();
//			System.out.println(txt);
//			
//		}
//		
		
		driver.close();
	}

}
