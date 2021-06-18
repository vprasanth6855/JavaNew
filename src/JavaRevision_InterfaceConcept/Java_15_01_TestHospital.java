package JavaRevision_InterfaceConcept;

public class Java_15_01_TestHospital {

	public static void main(String[] args) {
		FortisHospital obj = new FortisHospital();
		obj.ambulanceService();
		obj.cardioService();
		obj.dentalService();
		obj.emergencyService();
		obj.ENTService();
		obj.medicalInsurance();
		obj.neuroService();
		obj.orthopedicService();
		obj.OPTService();
		obj.pathologyService();
		obj.physioService();
		System.out.println(obj.min_fee);  //one way
		obj.services_911();
		USMedical.billing();
		
	    USMedical obj2 = new FortisHospital();
		obj2.ambulanceService();
		obj2.dentalService();
		obj2.orthopedicService();
		obj2.neuroService();
		System.out.println(USMedical.min_fee); //second way- preferred
		obj2.services_911();
		USMedical.billing();
		
	
	}

}
