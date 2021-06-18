package JavaRevision_Package1;

import java.util.ArrayList;

public class Java_05_02_ArrayListForString {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Harsha");
		names.add("Kavitha");
		names.add("Karthika");
		
		for(int i=0; i<names.size(); i++){
			System.out.println(names.get(i));
		}

	}

}
