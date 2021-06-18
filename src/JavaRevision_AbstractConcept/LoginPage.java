package JavaRevision_AbstractConcept;

public class LoginPage extends Page {
	
	public LoginPage(){
		System.out.println("LP-Constructor");
	}

	@Override
	public void header() {
		System.out.println("LP-Header");
		
	}

	@Override
	public void title() {
		System.out.println("LP-Title");
		
	}
	
	public HomePage login(String un, String pwd){
		System.out.println("LP-Login");
		System.out.println("Login with "+un+" and "+pwd);
		
		return new HomePage();
	}
	
	
	
	
	
}
