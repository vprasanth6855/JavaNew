package JavaRevision_Package1;

public class Java_02_03ConditionalStatements {

	public static void main(String[] args) {
		
		int num =15;
		if(num<20){
			System.out.println("pass");
		}
		if(num<15){
			System.out.println("Bye");
			if(num<10){
				System.out.println("fail");
				if(num<2){
					System.out.println("repeat");
				}
			}
		}

	}

}
