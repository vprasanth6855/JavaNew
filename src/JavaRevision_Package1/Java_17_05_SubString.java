package JavaRevision_Package1;

public class Java_17_05_SubString {

	public static void main(String[] args) {
		String st = "Transaction id is 1234";
		
		//subString from begin index
		System.out.println(st.substring(6));  
		
		//From begin index to end index
		System.out.println(st.substring(0, 12));
		
		System.out.println(st.substring(18));
		//or
		System.out.println(st.substring(st.indexOf("is")+3, st.length()));
		//or
		System.out.println(st.substring(st.indexOf("1234"), st.length()));
		
	}

}
