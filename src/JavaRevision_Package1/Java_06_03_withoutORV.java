package JavaRevision_Package1;

public class Java_06_03_withoutORV {

	String name;
	int age;
	char gender;
	boolean isPermanent;
	
	public static void main(String[] args) {
		new Java_06_03_withoutORV();
		new Java_06_03_withoutORV().name = "Kani";
		new Java_06_03_withoutORV().age = 23;
		new Java_06_03_withoutORV().gender = 'f';
		new Java_06_03_withoutORV().isPermanent = true;
		
		System.out.println(new Java_06_03_withoutORV().name);
		System.out.println(new Java_06_03_withoutORV().age);
		System.out.println(new Java_06_03_withoutORV().gender);
		System.out.println(new Java_06_03_withoutORV().isPermanent);
		
	}

}
