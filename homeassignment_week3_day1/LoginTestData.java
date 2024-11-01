package week3.day1.homeassignment_week3_day1;

public class LoginTestData extends TestData {
	
	public void enterUsername(String name) {
		System.out.println("The Entered user name is: "+name);
		
	}
	
	public void enterPassword(String password) {
		System.out.println("The default password is: "+password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData LD = new LoginTestData();
		LD.enterCredentials();
		LD.enterUsername("Subha");
		LD.enterPassword("Tester@99");
		LD.enterUsername("Riya");
		LD.enterPassword("Tester@99");
		LD.navigateToHomePage();
		

	}

}
