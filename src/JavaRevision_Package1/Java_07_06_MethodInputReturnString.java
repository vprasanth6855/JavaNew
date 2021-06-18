package JavaRevision_Package1;

public class Java_07_06_MethodInputReturnString {

	public static void main(String[] args) {
		Java_07_06_MethodInputReturnString t1 = new Java_07_06_MethodInputReturnString();
		String capital = t1. getCapitalName("India");
		System.out.println(capital);

	}
	
	public String getCapitalName(String countryName){
		if(countryName.equals("India")){
			return "New Delhi";
		}
		else if(countryName.equals("USA")){
			return "Washington DC";
		}
		else if(countryName.equals("Russia")){
			return "Moscow";
		}
		else if(countryName.equals("Japan")){
			return "Tokyo";
		}
		else{
			return "capital not found";
		}
	}

}
