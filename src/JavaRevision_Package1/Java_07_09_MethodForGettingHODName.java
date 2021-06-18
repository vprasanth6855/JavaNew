package JavaRevision_Package1;

public class Java_07_09_MethodForGettingHODName {

	public static void main(String[] args) {
		Java_07_09_MethodForGettingHODName t1 = new Java_07_09_MethodForGettingHODName();
		String HOD = t1.getHODName("Physics");
		if(HOD!=null){
		System.out.println(HOD);
		}
		else{
			System.out.println("No such department");
		}
	}

	public String getHODName(String departmentName) {
		if (departmentName.equals("Physics")) {
			return "Meena";
		}
		else if(departmentName.equals("Chemistry")){
			return "Teena";
		}
		else
		{
			return null;
		}
	}

}
