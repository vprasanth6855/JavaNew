package JavaRevision_Package1;

public class Java_18_06_CustomException {

	public static void main(String[] args) {
		try{
			throw new Exception("new Exception");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		 
	}

}
