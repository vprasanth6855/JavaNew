package JavaRevision_Package1;

public class Java_18_02_ExceptionHandlingTryCatchConcept {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		
		try{
		int i=9/0;
		}
		catch(Exception e){
			System.out.println("some exception occurred..");
			//e.printStackTrace();
			e.getMessage();
		}
		
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");

	}

}
