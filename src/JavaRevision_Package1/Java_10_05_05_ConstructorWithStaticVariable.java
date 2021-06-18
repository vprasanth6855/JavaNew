package JavaRevision_Package1;

public class Java_10_05_05_ConstructorWithStaticVariable {
	String name;
	int age;
	char gender;
	boolean isActive;
	static int wheels;
	
	

	public Java_10_05_05_ConstructorWithStaticVariable(String name, int age, char gender, boolean isActive, int wheels) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isActive = isActive;
		this.wheels = wheels;
	}



	public static void main(String[] args) {
		Java_10_05_05_ConstructorWithStaticVariable obj = new Java_10_05_05_ConstructorWithStaticVariable("Veena", 34, 'f', true, 4);
		System.out.println(obj.name+" "+obj.wheels);
	}

}
