package week3.day1.homeassignment_week3_day1;

public class TestData {

	public void enterCredentials() {
		System.out.println("Enter the user name and password");
		
	}
	public void navigateToHomePage() {
		System.out.println("Navigated to home page");
	}
	
	public static void main(String[] args) {
		TestData TD = new TestData();
		TD.enterCredentials();
		TD.navigateToHomePage();
	}
}
