package JavaRevision_Package1;

public class Java_10_04_04_Constructors {
	
	String name;
	int age;
	int userid;
	char gender;
	boolean isActive;
	
	public Java_10_04_04_Constructors(){
		System.out.println("default constructor");   
	}
	
	public Java_10_04_04_Constructors(int i){
		System.out.println("1 param "+i);
	}
	
	public Java_10_04_04_Constructors(int i, String name){
		System.out.println("2 param "+i+" "+name);
	}
	
	public Java_10_04_04_Constructors(String name, int age, int userid, char gender, boolean isActive){
		this.name = name;
		System.out.println("testing");
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		Java_10_04_04_Constructors obj = new Java_10_04_04_Constructors("Veena", 24, 1002, 'f', true);
		System.out.println(obj.name);
	}

}
