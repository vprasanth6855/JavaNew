package JavaRevision_Package1;

public class Java_18_03_MultipleCatchBlocks {

	public static void main(String[] args) {
		Java_18_03_MultipleCatchBlocks obj;//with no object created
		System.out.println("A");
		System.out.println("B");
		
		try{
		obj=null;   //object is null just that
		int i=9/0;  //then it comes to this line and it goes to arithmeticException catch block
		}
		catch(ArithmeticException e){
			System.out.println("some exception occurred..");
			//e.printStackTrace();
			e.getMessage();
		}
		catch(NullPointerException el){
			System.out.println("another exception...");
			el.printStackTrace();
		}
		System.out.println("C");
		System.out.println("D");
		
		

	}

}
