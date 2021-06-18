package JavaRevision_Package1;

public class Java_07_04_NoInputSomeReturnArray {

	public static void main(String[] args) {
		Java_07_04_NoInputSomeReturnArray t1 = new Java_07_04_NoInputSomeReturnArray();
		String days[] = t1.getWeekdaysName();

		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}

	}

	public String[] getWeekdaysName() {
		String days[] = new String[7];
		days[0] = "Sunday";
		days[1] = "Monday";
		days[2] = "Tuesday";
		days[3] = "Wednesday";
		days[4] = "Thursday";
		days[5] = "Friday";
		days[6] = "Saturday";

		return days;
	}
}
