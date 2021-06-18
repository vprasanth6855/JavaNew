package JavaRevision_Package1;

import java.util.ArrayList;

public class Java_05_05_ForloopInAnotherWay {

	public static void main(String[] args) {
		//for names
		ArrayList<String> names = new ArrayList<String>();
		names.add("Harsha");
		names.add("Kavita");
		names.add("Kaniha");
		
		for(String n : names){
			System.out.println(n);
		}
		
		
		
		
		//for emplyee age
		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(20);
		age.add(30);
		age.add(40);
		
		for(Integer i : age){
			System.out.println(i);
		}
	}

}
