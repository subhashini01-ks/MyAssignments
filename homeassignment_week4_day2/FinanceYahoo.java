package week4.day2.homeassignment_week4_day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FinanceYahoo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		//Maximize
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		//Load the url and click on “Crypto” tab
		WebElement more=driver.findElement(By.xpath("//span[text()='More']"));
		Actions act=new Actions(driver);
		act.moveToElement(more).perform();
		WebElement crypto=driver.findElement(By.xpath("(//a[text()='Crypto '])[3]"));
		crypto.click();
		//Identify the table in the dom using <table> tag (//table)
		List<WebElement> cryptoname = driver.findElements(By.xpath("//table/tbody/tr/td[2]/span/div"));
		for (WebElement cryptos : cryptoname) {
			String txt=cryptos.getText();
			System.out.println(txt);
			
		}

	}

}
