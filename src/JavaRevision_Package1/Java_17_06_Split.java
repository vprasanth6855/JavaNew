package JavaRevision_Package1;

public class Java_17_06_Split {

	public static void main(String[] args) {
		String data = "Tom;25;male;1000;USA";
		String dataVal[] = data.split(";");

		System.out.println(dataVal[0]);

		// printing
		for (int i = 0; i < dataVal.length; i++) {
			System.out.println(dataVal[i]);
		}

		String test = "xXJavaXxXPythonxXRubyxXSelenium";
		String val[] = test.split("xX");

		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}

		String name = "Tom Peter Steve";
		System.out.println(name.split(" ")[0]);
		System.out.println(name.split(" ")[1]);
		System.out.println(name.split(" ")[2]);
		for(int i=0; i<name.split(" ").length;i++){
			System.out.println(name.split(" ")[i]);
		}
		
		//IMPORTANT
		String credentials = "admin;testpassword";
		String username = credentials.split(";")[0];
		String password = credentials.split(";")[1];
		doLogin(username,password);
		
		System.out.println(credentials.indexOf("hello")); // will return -1
		
		String mesg = "Welcome admin";
		if(mesg.indexOf("admin")>0){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
		
		String mesg1 = "Welcome null";
		if(mesg1.indexOf("admin")>0){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	}
	
	public static void doLogin(String un, String pwd){
		System.out.println("login to app with "+un+" and "+pwd);
	}

}
