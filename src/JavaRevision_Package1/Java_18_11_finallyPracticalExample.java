package JavaRevision_Package1;

public class Java_18_11_finallyPracticalExample {

	public static void main(String[] args) {
		System.out.println("A");
		try{
		int i=9/0;
		}
		catch(NullPointerException e){  //here it must be arithmetic Exception
			e.printStackTrace();
		}
		
		finally{    //here without finally this B will not get printed
		System.out.println("B");
		}
	}

}
