package JavaRevision_AbstractConcept;

public class Java_16_01_TestPage {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.header();
		lp.title();
		lp.logOut();
		lp.signUp();
		
		HomePage hp = lp.login("admin", "admin");
		hp.header();
		hp.title();
		hp.userDetails();
		hp.logOut();
		
		//TOP CASTING
		Page p = new LoginPage();
		p.header();
		p.title();
		p.logOut();
		p.signUp();
		
		Page p1 = new HomePage();
		p1.header();
		p1.title();
		p1.logOut();
		
		Page.signUp();
	}

}
