package JavaRevision_Package1;

public class Java_17_01_StringManipulation {

	public static void main(String[] args) {
		//Calculate String length
		
		String str = "This is my java code and I am so happy";
		System.out.println("String length is : "+str.length());
		
		//character at a specified position
		System.out.println("The character at the poistion index 1: "+str.charAt(1));

		//character at string strength gives Array Index out of bounds exception
		//System.out.println("The character at the length 38: "+str.charAt(38));
		
		//indexOf
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("s"));  //first occurrence of s
		System.out.println(str.indexOf("s", 4)); //second occurrence of s
		System.out.println(str.indexOf("s", str.indexOf("s")+1)); //second occurrence of s
		System.out.println(str.indexOf('h'));
		
	}

}
