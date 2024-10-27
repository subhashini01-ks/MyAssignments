package week2.day2.homeassignment_week2_day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		//Maximize the browser window
		driver.manage().window().maximize();
		// select Your most favourite browser
		driver.findElement(By.xpath("//input[@id='j_idt87:console1:0']/following::span")).click();
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		WebElement checked=driver.findElement(By.xpath("//input[@id='j_idt87:city2:1']/following::span"));
		checked.click();
		WebElement unchecked=driver.findElement(By.xpath("//input[@id='j_idt87:city2:1']/following::span"));
		unchecked.click();
		boolean status=unchecked.isSelected();
		System.out.println("The radio button is selected ? "+status);
		//Identify the radio button that is initially selected by default
		/* List<WebElement> status1=driver.findElements(By.
		  xpath("(//h5[contains(text(),'Find the default select radio button')]//parent::div[@class='card'])//descendant::div[@class='ui-radiobutton ui-widget']"
		  )); 
		  for(int i=0;i<=status1.size();i++) { 
			  for(WebElement check:status1) {
		  if(check.isSelected()); 
		  System.out.println("The value is selected");
		  } */


		WebElement status1=driver.findElement(By.xpath("(//input[@id='j_idt87:console2:0']/following::span)[1]")); 
		boolean chrome = status1.isSelected();
		System.out.println("Chrome is selected ?"+chrome); 
		WebElement status2=driver.findElement(By.xpath("(//input[@id='j_idt87:console2:0']/following::span)[2]")); 
		boolean firefox =status2.isSelected(); 
		System.out.println("firefox is selected ?"+firefox);
		WebElement status3=driver.findElement(By.xpath("(//input[@id='j_idt87:console2:0']/following::span)[3]")); 
		boolean safari =status3.isEnabled(); 
		System.out.println("safari is selected ?"+safari);
		WebElement status4=driver.findElement(By.xpath("(//input[@id='j_idt87:console2:0']/following::span)[4]"));
		boolean edge =status4.isSelected(); 
		System.out.println("edge is selected ?"+edge);
        //Check and select the age group (21-40 Years) if not already selected.
		WebElement agegroup=driver.findElement(By.xpath("//input[@id='j_idt87:age:1']/following::span"));
		if(agegroup.isDisplayed()) {
		System.out.println("The age group is already selected");
		}else
		{agegroup.click();
		}
		driver.close();						
	}
}









