package JavaRevision_Package1;

public class Java_10_07_07_ConstructorAndMethod {

	String username;
	String password;
	String emailId;
	int otp;
	long mobileNumber;
	String facebookId;
	
	
	public Java_10_07_07_ConstructorAndMethod(String username, String password, String emailId, int otp,
			long mobileNumber, String facebookId) {
		super();
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.otp = otp;
		this.mobileNumber = mobileNumber;
		this.facebookId = facebookId;
	}


	public Java_10_07_07_ConstructorAndMethod(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Java_10_07_07_ConstructorAndMethod(String emailId, int otp) {
		super();
		this.emailId = emailId;
		this.otp = otp;
	}


	public Java_10_07_07_ConstructorAndMethod() {
		super();
	}

	public void doLogin(){
		System.out.println("login with: "+ emailId +" "+otp);
	}

	public static void main(String[] args) {
		//Java_10_07_07_ConstructorAndMethod obj = new Java_10_07_07_ConstructorAndMethod("veenasmohan@gmail.com", "12345");
		//obj.doLogin();
		
		Java_10_07_07_ConstructorAndMethod obj =new Java_10_07_07_ConstructorAndMethod("veenasmohan@gmail.com","1234","veena@gmail.com", 7899,34567890, "face1" );
		obj.doLogin();
	}

}
