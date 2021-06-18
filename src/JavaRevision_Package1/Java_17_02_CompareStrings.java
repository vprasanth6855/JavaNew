package JavaRevision_Package1;

public class Java_17_02_CompareStrings {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2 = "Hello World";
		System.out.println(s1.equals(s2));
		
		String s3 = "Hello World";
		String s4 = "hello World";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
