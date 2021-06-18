package JavaRevision_Package1;

public class Java_13_06_CompanyTest {

	public static void main(String[] args) {
		Java_13_05_Company obj = new Java_13_05_Company();
		obj.setName("IBM");
		obj.setTotalemp(5000);
		obj.setBudget(10000);
		obj.setProjects("AI-Robotics");
		
		System.out.println(obj.getName());
		System.out.println(obj.getTotalemp());
		System.out.println(obj.getBudget());
		System.out.println(obj.getProjects());
		
		obj.name="withoutgetSet";
		System.out.println(obj.name);

	}

}
