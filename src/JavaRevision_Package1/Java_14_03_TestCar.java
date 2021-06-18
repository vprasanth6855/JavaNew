package JavaRevision_Package1;

public class Java_14_03_TestCar {

	public static void main(String[] args) {
		Java_14_02_BMW obj = new Java_14_02_BMW();//object of BMW class
		obj.start();
		obj.stop();
		obj.refuel();
		obj.autoAirSuspension();
		obj.engine(); //grandparent (of BMW) method called
		
		Java_14_01_Car obj2 = new Java_14_01_Car();//Object of car class
		obj2.start();
		obj2.stop();
		obj2.refuel();
		obj2.engine(); //parent (of car) method called
		//obj2.auto... cannot be called
		
		Java_14_01_Car obj3 = new Java_14_02_BMW();//TOP CASTING via Parent
		obj3.start();
		obj3.stop();
		obj3.refuel();
		obj3.engine();//can be called here also
		//obj3.auto... Reference signature type checking
		
		
		//DownCasting
		//Java_14_02_BMW obj4 = (Java_14_02_BMW) new Java_14_01_Car();
		
		
		Java_14_04_Vehicle obj5 = new Java_14_02_BMW();//TOP CASTING via grandparent
		obj5.engine();
		

	}

}
