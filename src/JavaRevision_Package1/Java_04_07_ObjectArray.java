package JavaRevision_Package1;

public class Java_04_07_ObjectArray {

	public static void main(String[] args) {
		Object emp[] = new Object[5];
		
		emp[0] = "Godo";
		emp[1] = 21;
		emp[2] = 'm';
		emp[3] = true;
		emp[4] = 5.2;
		
		for(int i=0; i<emp.length; i++){
			System.out.println(emp[i]);
		}
	}

}
