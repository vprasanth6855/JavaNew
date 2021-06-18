package JavaRevision_AbstractConcept;

public abstract class Page {
	
	public Page(){
		System.out.println("Page class constructor");
	}

	public abstract void header();
	public abstract void title();
	
	public final void logOut(){
		System.out.println("user is logged out");
	}
	
	public static void signUp(){
		System.out.println("Page-sign Up");
	}
}
