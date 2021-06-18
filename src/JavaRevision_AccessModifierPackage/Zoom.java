package JavaRevision_AccessModifierPackage;

public class Zoom {

	public static void main(String[] args) {
		Meeting m = new Meeting(450, "test123");
		System.out.println(m.id);
		//System.out.println(m.pa..); //cannot call
		System.out.println(m.studentCount);
		System.out.println(m.isRecorded);
		
		m.start();
		//m.cha...  cannot call
		
		
		
	

	}

}
