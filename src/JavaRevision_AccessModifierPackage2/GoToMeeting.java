package JavaRevision_AccessModifierPackage2;

import JavaRevision_AccessModifierPackage.Meeting;

public class GoToMeeting extends Meeting {
	

	public GoToMeeting(int id, String password) {
		super(id, password);
		
	}

	public static void main(String[] args) {
		Meeting m = new Meeting(124, "test123");
		System.out.println(m.id);
		//System.out.println(m.pa..); cannot call
		//System.out.println(m.stu...);
		//System.out.println(m.is);
		
		m.start();
		//m.cha.. cannot call
		
		GoToMeeting go = new GoToMeeting(3455, "test123");
		System.out.println(go.isRecorded);
		
		

	}

}
