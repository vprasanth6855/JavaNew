package JavaRevision_Package1;

import java.util.ArrayList;

public class Java_05_03_ArrayListForInteger {

	public static void main(String[] args) {
		ArrayList<Integer> empAge = new ArrayList<Integer>();
		
		empAge.add(20);
		empAge.add(30);
		empAge.add(40);
		
		for(int i=0; i<empAge.size(); i++){
			System.out.println(empAge.get(i));
		}
		
		}

}
