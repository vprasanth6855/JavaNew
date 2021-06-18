package JavaRevision_InterfaceConcept;

public interface USMedical extends WHO{
	
	int min_fee =10;
	
	public void orthopedicService();
	
	public void dentalService();
	
	public void neuroService();
	
	public void ambulanceService();
	
	//default feature (After jdk 1.8)
	default void services_911(){
		System.out.println("US 911");
	}
	
	//static method (after jdk 1.8)
	public static void billing(){
		System.out.println("US billing");
	}

}
