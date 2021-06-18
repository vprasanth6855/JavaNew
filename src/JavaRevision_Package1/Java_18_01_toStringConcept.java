package JavaRevision_Package1;

public class Java_18_01_toStringConcept {
	
	String name;
	String course;
	String time;
	
	public Java_18_01_toStringConcept(){
		
	}
	

	public Java_18_01_toStringConcept(String name, String course, String time) {
		super();
		this.name = name;
		this.course = course;
		this.time = time;
	}


	@Override
	public String toString() {
		return "Java_18_01_Training [name=" + name + ", course=" + course + ", time=" + time + "]";
	}


	public static void main(String[] args) {
		Java_18_01_toStringConcept tr = new Java_18_01_toStringConcept();
		//System.out.println(tr);
		System.out.println(tr.toString());
		
		Java_18_01_toStringConcept tr1 = new Java_18_01_toStringConcept("Veena","Java", "7am");
		System.out.println(tr1.toString());

	}

}
