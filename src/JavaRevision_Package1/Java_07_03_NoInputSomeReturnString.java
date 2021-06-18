package JavaRevision_Package1;

public class Java_07_03_NoInputSomeReturnString {

	public static void main(String[] args) {
		Java_07_03_NoInputSomeReturnString t1 = new Java_07_03_NoInputSomeReturnString();
		String trainer = t1.getTrainerName();
		System.out.println("Trainer's name is " + trainer);
	}

	public String getTrainerName() {
		String name = "Madhav";
		return name;
	}

}
