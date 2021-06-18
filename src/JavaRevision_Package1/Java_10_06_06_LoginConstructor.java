package JavaRevision_Package1;

public class Java_10_06_06_LoginConstructor {

	String username;
	String password;
	String emailId;
	int otp;
	long mobileNumber;
	String facebookId;
	
	
	
	
	public Java_10_06_06_LoginConstructor(String username, String password, String emailId, int otp, long mobileNumber,
			String facebookId) {
		super();
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.otp = otp;
		this.mobileNumber = mobileNumber;
		this.facebookId = facebookId;
	}

	
	public Java_10_06_06_LoginConstructor(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	

	public Java_10_06_06_LoginConstructor(String emailId, int otp) {
		super();
		this.emailId = emailId;
		this.otp = otp;
	}
	
	


	public static void main(String[] args) {
		//Java_10_06_06_LoginConstructor obj = new Java_10_06_06_LoginConstructor(); //it wil show error. so create a default constructor also

	}

}
