package JavaRevision_Package1;

public class Java_09_01_ClassAClassB {

	public static void main(String[] args) {
		System.out.println("classA Main method");
        System.out.println("Calling class B main method");
        Java_09_02_ClassBClassA.main(args);
	}

}
