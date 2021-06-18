package JavaRevision_Package1;

public class Java_06_02_IntroductionToClass {

	//Creating Objects
	String name;
	int age;
	char gender;
	boolean isPermanent;
	
	public static void main(String[] args) {
		Java_06_02_IntroductionToClass employee1 = new Java_06_02_IntroductionToClass();
		employee1.name = "Tini";
		employee1.age = 23;
		employee1.gender = 'f';
		employee1.isPermanent = true;
		
		Java_06_02_IntroductionToClass employee2 = new Java_06_02_IntroductionToClass();
		employee2.name = "John";
		employee2.age = 34;
		employee2.gender ='m';
		employee2.isPermanent = false;
		
		System.out.println(employee1.name + " "+employee1.age + " "+ employee1.gender + " "+ employee1.isPermanent );
		System.out.println(employee2.name + " "+employee2.age + " "+ employee2.gender + " "+ employee2.isPermanent );
	}

}
