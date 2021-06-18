package JavaRevision_Package1;

public class Java_06_04_ComparingObjects {
	
		String name;
		int age;
	public static void main(String[] args) {
		
		Java_06_04_ComparingObjects e1 = new Java_06_04_ComparingObjects();
		e1.name = "Tini";
		e1.age = 23;
		
		Java_06_04_ComparingObjects e2 = new Java_06_04_ComparingObjects();
		e2.name = "Jeen";
		e2.age = 56;
		
		System.out.println(e1.name);
		e1=e2;
		System.out.println(e1.name);
		System.out.println(e2.name);
		

	}

}
