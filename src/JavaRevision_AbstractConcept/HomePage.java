package JavaRevision_AbstractConcept;

public class HomePage extends Page{

	public HomePage(){
		System.out.println("HP-Constructor");
	}
	@Override
	public void header() {
		System.out.println("HP-Header");
		
	}

	@Override
	public void title() {
		System.out.println("HP-title");
		
	}
	
	public void userDetails(){
		System.out.println("HP-UserDetails");
	}

}
