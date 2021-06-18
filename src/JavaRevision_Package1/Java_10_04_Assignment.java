package JavaRevision_Package1;

import java.util.ArrayList;

public class Java_10_04_Assignment {

	public static void main(String[] args) {
		Java_10_04_Assignment obj = new Java_10_04_Assignment();
		obj.arrayproblem1();

		obj.insert();

		obj.retrieve();

		obj.update();

		obj.remove();

		obj.search();

		obj.reverse();

		obj.extract();
		
		obj.swaping();
		
		obj.empty();
		
		obj.trimming();
		
		obj.printingPositionsValue();
	}

	// Write a java program to create a new array list, add some colors like:
	// Red, Orange (String) and print out the collection
	public void arrayproblem1() {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Green");
		colors.add("Yellow");

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
	}

	// write a program to insert an element into the arraylist at the first and
	// last position
	public void insert() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Reena");
		names.add("Teena");
		names.add("Deena");
		names.add("Leena");
		System.out.println("The elements of this array are: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		// adding new elements into the first and last position
		names.add(0, "Dona");
		names.add(3, "Mona");
		System.out.println("The new elements of the array are: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

	// write a program to retrieve an element (at a specified index) from a
	// given array list
	public void retrieve() {
		ArrayList<String> people = new ArrayList<String>();
		people.add("Deena");
		people.add("Leena");
		people.add("Meena");

		System.out.println("The element in the second position is: " + people.get(1));
	}

	// write a java program to update specific array element by given element
	public void update() {
		ArrayList<String> tutors = new ArrayList<String>();
		tutors.add("Naveen");
		tutors.add("Pawan");
		tutors.add("Kiwan");
		System.out.println(tutors);
		// replacing Pawan with Jawan
		tutors.set(1, "Jawan");
		System.out.println(tutors);
	}

	// write a java program to remove the third element from an arrayList
	public void remove() {
		ArrayList<Object> employee = new ArrayList<Object>();
		employee.add("Neena");
		employee.add("Nayana");
		employee.add("Nima");
		System.out.println(employee);
		// removing the third element
		employee.remove(2);
		System.out.println(employee);
	}

	// write a java program to search an element in an arrayList
	public void search() {
		ArrayList<Object> students = new ArrayList<Object>();
		students.add("Madhav");
		students.add("Neerav");
		students.add("Arnav");
		System.out.println(students);
		// seraching for Neerav
		boolean b = students.contains("Neerav");
		System.out.println(b);
	}

	// write a java program to reverse elements in an arrayList
	public void reverse() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println("The array elements before reversing: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("The array elements after reversing: ");
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}

	}

	// write a java program to extract a portion of an arraylist. (use sublist
	// method)
	public void extract() {
		ArrayList<String> colorcode = new ArrayList<String>();
		colorcode.add("Orange");
		colorcode.add("Red");
		colorcode.add("Yellow");
		colorcode.add("Purple");
		colorcode.add("Green");
		colorcode.add("Blue");
		System.out.println("The colorcode before extracting: " + colorcode);

		// from index : inclusive, to index : exclusive, this means the 3rd
		// index won't be included in the list
		System.out.println("The colorcode after extracting: " + colorcode.subList(0, 3));

	}

	// write a java program to swap two elements in an arraylist
	public void swaping() {
		ArrayList<Double> db = new ArrayList<Double>();
		db.add(12.24);
		db.add(2.34);
		db.add(1.00);
		System.out.println("The array before swapping: "+db);
		
		double temp = db.get(0);
		db.set(0, db.get(1));
		db.set(1, temp);
		
		System.out.println("The array after swaping: "+db);
	}
	
	//write a java program to empty an arrayList
	public void empty(){
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Blue");
		color.add("Purple");
		System.out.println("Before removing elements: "+color);
		color.removeAll(color);
		System.out.println("After removing elements: "+color);
	}
	
	//write a java program to trim the virtual capacity of an arraylist the current list size:
	//use trimtosize method of arraylist
	public void trimming(){
		ArrayList<String> countryName = new ArrayList<String>();
		countryName.add("India");
		countryName.add("USA");
		countryName.add("Australia");
		countryName.add("Russia");
		System.out.println(countryName);
		countryName.trimToSize(); //trimToSize used for memory optimization
		
	}
	
	//write a java program to print all the elements of an arrayList using the position of the elements
	public void printingPositionsValue(){
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Canada");
		countries.add("Kuwait");
		
		System.out.println(countries.get(3));
		System.out.println(countries.get(2));
		System.out.println(countries.get(1));
		System.out.println(countries.get(0));
	}

}
