package JavaRevision_Package1;

public class Java_08_01_StaticAndNonstatic {

	String name;   //non static variable
	static int age;  //static variable
	
	public static void main(String[] args) {
		Java_08_01_StaticAndNonstatic obj = new Java_08_01_StaticAndNonstatic();
		obj.name = "Veena";
		obj.serach();
		
		age = 25;
		System.out.println(age);
		getName();
		
		Java_08_01_StaticAndNonstatic.age = 30;
		System.out.println(Java_08_01_StaticAndNonstatic.age);
		Java_08_01_StaticAndNonstatic.getName();
		
		

	}
	
	public void serach(){              //non static method
		System.out.println("search Method");
	}
	
	public static void getName(){           //static method
		System.out.println("get name method");
	}

}
