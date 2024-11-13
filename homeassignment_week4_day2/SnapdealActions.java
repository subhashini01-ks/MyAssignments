package week4.day2.homeassignment_week4_day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//Maximize
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Go to "Men's Fashion"
		driver.findElement(By.xpath("(//span[@class='catText'])[1]")).click();
		//Go to "Sports Shoes"
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		//Get the count of sports shoes
		WebElement sportshoecount=driver.findElement(By.xpath("//div[@class='category-name-wrapper clearfix ']/descendant::span"));
		String shoecount=sportshoecount.getText();
		System.out.println("Count of sports shoes: "+shoecount);
		//Click on "Training Shoes"
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//Sort the products by "Low to High"
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/descendant::li[@data-sorttype='plth']")).click();
		//Check if the displayed items are sorted correctly
		//Select any price range ex:(500-700)
		WebElement fromvalue=driver.findElement(By.xpath("//input[@name='fromVal']"));
		fromvalue.clear();
		fromvalue.sendKeys("500");
		WebElement tovalue=driver.findElement(By.xpath("//input[@name='toVal']"));
		tovalue.clear();
		tovalue.sendKeys("1000");
		//click go button
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		//click on color
		//driver.findElement(By.xpath("//div[@data-filtername='Color_s']")).click();
		//Filter by any colour
		Thread.sleep(2000);
		WebElement color=driver.findElement(By.xpath("//a[text()=' White & Blue']"));
		driver.executeScript("arguments[0].click()", color);
		Thread.sleep(2000);
		//Verify all the applied filters
		List<WebElement> filters = driver.findElements(By.xpath("//div[@class='filters']/descendant::a"));
		for (WebElement filtername : filters) {
			String txt=filtername.getText();
			System.out.println(txt);
			
		}
		//Mouse hover on the first resulting "Training Shoes".
		WebElement firstresult=driver.findElement(By.xpath("(//div[@class='product-tuple-description ']/descendant::a)[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(firstresult).perform();
		//click on the quick view button
		WebElement quick=driver.findElement(By.xpath("(//div[@class='clearfix row-disc']/div[contains(text(),'Quick View')])[1]"));
		quick.click();
		//Print the cost and the discount percentage
		WebElement cost=driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[@class='payBlkBig']"));
		Thread.sleep(2000);
		String txtone=cost.getText();
		System.out.println("The cost of the shoe is: "+txtone);
		WebElement disc=driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[@class='percent-desc ']"));
		String txttwo=disc.getText();
		System.out.println("The discount for shoe is: "+txttwo);
		//Take a snapshot of the shoes
		WebElement shoeimg=driver.findElement(By.xpath("//div[@class='col-xs-11 quickViewModal ']"));
		File src=shoeimg.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/image2.png");
		FileUtils.copyFile(src, desc);
		//Close the current window.
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		//close the driver
		driver.close();

	}

}
