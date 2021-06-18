package JavaRevision_Package1;

public class Java_18_04_MultipleCatchBlocks {

	String name = "Tom";
	public static void main(String[] args) {
		Java_18_04_MultipleCatchBlocks obj = new Java_18_04_MultipleCatchBlocks();
		System.out.println("A");
		System.out.println("B");
		
		try{
		//obj = null;
		System.out.println(obj.name);//now it will throw Nullpointer exception
		int i = 9/0;
		}
		catch(ArithmeticException e){
			System.out.println("some exception occurred..");
			//e.printStackTrace();
			e.getMessage();
		}
		catch(NullPointerException e1){
			e1.printStackTrace();
		}
		System.out.println("C");
		System.out.println("D");
	}

}
