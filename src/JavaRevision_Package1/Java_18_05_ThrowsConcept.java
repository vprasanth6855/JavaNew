package JavaRevision_Package1;

public class Java_18_05_ThrowsConcept {

	public static void main(String[] args)  {
		Java_18_05_ThrowsConcept obj = new Java_18_05_ThrowsConcept();
		try{
		obj.m1();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("ABC");

	}
	public void m1() throws Exception{
		m2();
	}
	public void m2() throws Exception{
		int i=9/0;
	}

}
