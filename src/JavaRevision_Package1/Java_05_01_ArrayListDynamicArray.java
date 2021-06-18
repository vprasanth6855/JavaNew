package JavaRevision_Package1;

import java.util.ArrayList;

public class Java_05_01_ArrayListDynamicArray {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		System.out.println("2 data added");
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		System.out.println("4 data added");
		System.out.println(ar.size());
		ar.add("test1");
		ar.add("test2");
		System.out.println("6 data added");
		System.out.println(ar.size());
		ar.remove(3);
		System.out.println("1 data removed");
		System.out.println(ar.size());
		System.out.println("getting the value of 0th index");
		System.out.println(ar.get(0));
	}

}
