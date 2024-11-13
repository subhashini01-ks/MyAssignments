package week4.day1.homeassignment_week4_day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		WebElement ele = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		ele.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		WebElement textok = driver.findElement(By.xpath("//p[@id='demo']"));
		String text = textok.getText();
		System.out.println(text);
		if(text.equals("You pressed OK!")) {
			System.out.println("Frames handled Successfully");
		}
		else {
			System.out.println("Frames not handled Successfully");

		}
		driver.close();
}
}