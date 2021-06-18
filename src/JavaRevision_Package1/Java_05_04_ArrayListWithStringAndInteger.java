package JavaRevision_Package1;

import java.util.ArrayList;

public class Java_05_04_ArrayListWithStringAndInteger {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Veena");
		names.add("Prasanth");
		names.add("Madhav");
		
		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(34);
		age.add(38);
		age.add(7);
		
		for(int i=0; i<names.size(); i++){
			System.out.println("Employee " + names.get(i) + " is "+ age.get(i) + " years old");
		}
				

	}

}
