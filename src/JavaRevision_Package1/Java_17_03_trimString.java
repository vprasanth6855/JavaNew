package JavaRevision_Package1;

public class Java_17_03_trimString {

	public static void main(String[] args) {
		//trim
		String p = "   hello world   ";
		System.out.println(p.trim());
		
		//trim and replace
		System.out.println(p.trim().replace(" ", ""));
		
		//replace
		String m = "01-01-1990";
		System.out.println(m.replace("-", "/"));

	}

}
