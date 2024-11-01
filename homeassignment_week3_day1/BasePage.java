package week3.day1.homeassignment_week3_day1;

public class BasePage {
	
	public void findElement() {
		System.out.println("Find Element will return a single element");
	}
	
	public void clickElement() {
		System.out.println("Element is clicked using click() method");
		
	}
	
	public void enterText() {
		System.out.println("The text is entered");
	}
	
	public void performCommonTasks() {
		System.out.println("The login is performed");
	}
	
	public static void main(String[] args) {
		BasePage bp = new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
	}

}
