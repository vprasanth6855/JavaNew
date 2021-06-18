package JavaRevision_Package1;

public class Java_18_07_CustomExceptionApplication {

	public static void main(String[] args) {
		try{
			throw new Exception("new Exception");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		String colVal = null;
		if(colVal==null){
			try{
				throw new Exception("column value not found exception");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
