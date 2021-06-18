package JavaRevision_Package1;

public class Java_19_03_Finalize {

	public static void main(String[] args) {
		//Java_19_02_withDataConversion obj = new Java_19_02_withDataConversion();
		
		Java_19_03_Finalize obj = new Java_19_03_Finalize();
		obj = null;

		System.gc();
		System.out.println("processing done");

	}
	
	@Override
	public void finalize(){
		System.out.println("this is my finalize method");
	}

}
