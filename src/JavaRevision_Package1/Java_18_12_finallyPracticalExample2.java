package JavaRevision_Package1;

public class Java_18_12_finallyPracticalExample2 {

	public static void main(String[] args) {
		int s =revenue();
		System.out.println(s);
	}
	
	public static int revenue(){
		try{
		int p =100;
		int t = p+200;
		int total = t/0;
		return total;
		}
		catch(Exception e){
			System.out.println("some exception..");
		}
		finally{
			return 0;
		}
	}

}
