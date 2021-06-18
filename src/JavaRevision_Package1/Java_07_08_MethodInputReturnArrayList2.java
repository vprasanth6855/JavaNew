package JavaRevision_Package1;

import java.util.ArrayList;

public class Java_07_08_MethodInputReturnArrayList2 {
//IMPROVED METHOD
	public static void main(String[] args) {
		Java_07_08_MethodInputReturnArrayList2 t1 = new Java_07_08_MethodInputReturnArrayList2();
		ArrayList<String> students = t1.getStudentList("October");
		System.out.println(students); //for array
		System.out.println(students.size());
		for(String n : students){   //for printing
			System.out.println(n);
		}

	}

	public ArrayList<String> getStudentList(String batchName) {
		ArrayList<String> studentsList = new ArrayList<String>();
		if (batchName.equals("September")) {
			studentsList.add("Madhav");
			studentsList.add("neerav");
			studentsList.add("prasanth");
		} else if (batchName.equals("October")) {
			studentsList.add("Mavan");
			studentsList.add("Raven");

		}
		return studentsList;

	}

}
