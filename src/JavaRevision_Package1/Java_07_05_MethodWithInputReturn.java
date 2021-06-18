package JavaRevision_Package1;

public class Java_07_05_MethodWithInputReturn {

	public static void main(String[] args) {
		Java_07_05_MethodWithInputReturn t1 = new Java_07_05_MethodWithInputReturn();
		int result = t1.division(10, 5);
		System.out.println(result);

	}
	
	public int division(int a, int b){
		System.out.println("division Method");
		int d = a/b;
		
		return d;
	}

}
