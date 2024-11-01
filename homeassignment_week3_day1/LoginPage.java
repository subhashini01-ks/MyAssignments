package week3.day1.homeassignment_week3_day1;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("The logout is performed");
	}
	public static void main(String[] args) {
		// Method overriding
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();

	}

}
