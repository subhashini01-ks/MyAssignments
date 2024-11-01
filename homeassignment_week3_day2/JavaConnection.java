package week3.day2.homeassignment_week3_day2;

public class JavaConnection extends MySqlConnection {



	
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("The sql got connected");

	}

	
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("The sql got disconnected");

	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("The query was updated");

	}
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();


	}


	@Override
	public void executeQuery() {
		System.out.println("The query got executed");
		
	}

}
