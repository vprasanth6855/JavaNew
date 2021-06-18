package JavaRevision_Package1;

public class Java_10_05_05_ConstructorCreatedByEclipse {
	String name;
	int age;
	int userId;
	char gender;
	boolean isActive;
	
	
	public Java_10_05_05_ConstructorCreatedByEclipse(String name, int age, int userId, char gender, boolean isActive) {
		super();
		this.name = name;
		this.age = age;
		this.userId = userId;
		this.gender = gender;
		this.isActive = isActive;
	}


	public static void main(String[] args) {
		Java_10_05_05_ConstructorCreatedByEclipse obj1 = new Java_10_05_05_ConstructorCreatedByEclipse("Veena", 34, 278, 'f', true);
		Java_10_05_05_ConstructorCreatedByEclipse obj2 = new Java_10_05_05_ConstructorCreatedByEclipse("Madhav", 7, 234, 'm', true);
		Java_10_05_05_ConstructorCreatedByEclipse obj3 = new Java_10_05_05_ConstructorCreatedByEclipse("Prasanth", 40, 456, 'm', true);
		
		System.out.println(obj1.name+" "+obj1.isActive);
		System.out.println(obj2.name+" "+obj2.isActive);
		System.out.println(obj3.name+" "+obj3.isActive);
	}

}
