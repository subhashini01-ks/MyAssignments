package week3.day1.homeassignment_week3_day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("The endpoint URL is :"+endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("The enod point URL is :"+endpoint +"The request body is :"+requestBody + "The request status is :"+requestStatus);
	}
	
	public static void main(String[] args) {
		// Method over loading 
		APIClient api=new APIClient();
		api.sendRequest("https://platform.testleaf.com/");
		api.sendRequest("https://platform.testleaf.com/","{Hi Testleaf}",true);
		api.sendRequest("https://www.amazon.in/");
		api.sendRequest("https://www.amazon.in/", "{Hi Amazon}", false);
		
		

	}

}
