package JavaRevision_InterfaceConcept;

public class FortisHospital implements USMedical, UKMedical, IndiaMedical {
	
	@Override
	public void orthopedicService(){
		System.out.println("FH-Ortho");
	}
	
	@Override
	public void dentalService(){
		System.out.println("FH-dental");
	}
	
	@Override
	public void neuroService(){
		System.out.println("FH-neuro");
	}
	
	@Override
	public void ambulanceService(){
		System.out.println("FH-ambulance");
	}
	
	@Override
	public void physioService(){
		System.out.println("FH-physio");
	}
	
	@Override
	public void ENTService(){
		System.out.println("FH-ENT");
	}
	
	@Override
	public void pediatricService(){
		System.out.println("FH-pediatric");
	}
	
	@Override
	public void emergencyService(){
		System.out.println("FH-emergency");
	}
	
	@Override
	public void cardioService(){
		System.out.println("FH-cardio");
	}
	
	@Override
	public void OPTService(){
		System.out.println("FH-OPT");
	}
	
	@Override
	public void services_911(){
		System.out.println("overridden");
	}
	
	@Override
	public void polioService(){
		System.out.println("FH-Polio");
	}
	
	//non-overridden methods
	public void medicalInsurance(){
		System.out.println("FH-med");
	}
	
	public void pathologyService(){
		System.out.println("FH-Patho");
	}
}
