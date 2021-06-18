package JavaRevision_AccessModifierPackage;

public class Meeting {
	public int id;
	private String password;
	int studentCount =100;
	protected boolean isRecorded = true;

	public Meeting(int id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void start(){
		System.out.println("Meeting start");
	}
	
	private void chat(){
		System.out.println("Meeting chat");
	}

	public static void main(String[] args) {
		Meeting m = new Meeting(123, "test123");
		System.out.println(m.id);
		System.out.println(m.password);
		System.out.println(m.studentCount);
		System.out.println(m.isRecorded);
		
		m.start();
		m.chat();
	}
	

}
