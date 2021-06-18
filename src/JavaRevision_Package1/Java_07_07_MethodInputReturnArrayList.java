package JavaRevision_Package1;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

public class Java_07_07_MethodInputReturnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = getStudentsList("September");
		if (lst != null) {
			System.out.println(lst);
			System.out.println(lst.toArray()[0]);
			System.out.println(lst.get(1));
		}
		else{
			System.out.println("no such batch exists");
		}
	}

	public static ArrayList<String> getStudentsList(String batchName) {
		if (batchName.equals("September")) {
			ArrayList<String> studentsSep = new ArrayList<String>();
			studentsSep.add("Madhav");
			studentsSep.add("Neerav");
			studentsSep.add("Prasanth");

			return studentsSep;
		} else if (batchName.equals("October")) {
			ArrayList<String> studentsOct = new ArrayList<String>();
			studentsOct.add("Tini");
			studentsOct.add("mini");
			studentsOct.add("vini");

			return studentsOct;
		}

		return null;

	}

}
