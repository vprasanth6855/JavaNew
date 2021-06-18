package JavaRevision_ConstructorChaining;

public class RealEstate extends Business {

	public RealEstate(String type, int revenue, String branches) {
		super(type, revenue, branches);
		// TODO Auto-generated constructor stub
	}

	//public RealEstate() {
		//System.out.println("Real estate default constructor");
	//}
	
	private RealEstate(){
		super();
		System.out.println("real estate default constructor");
	}

	public static void main(String[] args) {
		RealEstate rs = new RealEstate("realEstate", 10000, "Bangalore");
		System.out.println(rs.type);
		
		RealEstate rs1 = new RealEstate();

	}

}
