package JavaRevision_Package1;

public class Java_07_02_NoInputSomeReturnInteger {

	public static void main(String[] args) {
		Java_07_02_NoInputSomeReturnInteger t1 = new Java_07_02_NoInputSomeReturnInteger();
		int sum = t1.add();
		System.out.println("sum is "+ sum);

	}
	
	public int add(){
		System.out.println("addition method..");
		int a =10;
		int b =20;
		int c= a+b;
		
		return c;
	}

}
