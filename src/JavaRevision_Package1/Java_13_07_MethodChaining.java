package JavaRevision_Package1;

public class Java_13_07_MethodChaining {

	public static void main(String[] args) {
		m1();
		Java_13_07_MethodChaining obj = new Java_13_07_MethodChaining();
		obj.NS1();
	}
	
	//static methods
	public static void m1(){
		Java_13_07_MethodChaining obj2 = new Java_13_07_MethodChaining();
		obj2.NS1();
		m2();
	}
	public static void m2(){
		m3();
	}
	public static void m3(){
		System.out.println("HI");
	}

	//non static methods
	public void NS1(){
		NS2();
		m2();
	}
	public void NS2(){
		NS3();
	}
	public void NS3(){
		NS4();
	}
	public void NS4(){
		System.out.println("BYE");
	}
}
