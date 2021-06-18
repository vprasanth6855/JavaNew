package JavaRevision_Package1;

import java.util.ArrayList;

public class Java_10_05_Assignment {

	public static void main(String[] args) {
		Java_10_05_Assignment obj = new Java_10_05_Assignment();
		boolean isEqual = obj.stringEqual("Hello", "Hello");
		if (isEqual == true) {
			System.out.println("They are equal");
		} else {
			System.out.println("Not equal");
		}

		obj.removingSpace("    Hello Everone  ");

		obj.firstAndLastChar("Hello");

		obj.firstAndLastChar("Hello veena");
		obj.firstAndLastChar("Hello");

		boolean exist = obj.verifyWord("Hi", "Hi is there someone at the door");
		if (exist == true) {
			System.out.println("word exists!");
		} else {
			System.out.println("word doesn't exist!");
		}

		obj.reverseName("Veena");

		obj.lastHalf("Hello Everyone");

		obj.indexOfMethod("Hi this is something important", "is", 2);

		obj.breaksString("alpha, beta, gamma, delta");

		obj.middleWord("alpha beta gamma");

		String numeric = obj.onlyNumeric("your transaction id is: 12345 and reference id is 34567");
		System.out.println(numeric);

		obj.cricketData();

		obj.pattern(4);
		
		obj.thirdE("The elephant is in the room", 'e');
	}

	// write a program to check two different strings equality
	public boolean stringEqual(String name1, String name2) {
		if (name1.equals(name2)) {
			return true;
		} else {
			return false;
		}
	}

	// remove all spaces in a string. For eg., " HelloEveryone "; expected
	// result-"HelloEveryone"
	public void removingSpace(String part) {
		System.out.println(part.trim());
	}

	// write a program that will print out the last character and first
	// character of a word
	// here we use charAt() method
	public void firstAndLastChar(String word) {
		int n = word.length();
		char firstLetter = word.charAt(0);
		char lastLetter = word.charAt(n - 1);
		System.out.println("The first letter is: " + firstLetter);
		System.out.println("The last letter is: " + lastLetter);
	}

	// Write a program to verify a word or a character contained in the
	// sentence.
	public boolean verifyWord(String word, String sentence) {
		if (sentence.contains(word)) {
			return true;
		} else {
			return false;
		}
	}

	// write a function to reverse your own name
	public void reverseName(String name) {
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}

	// Write a program that gives you the last half of the string.
	public void lastHalf(String sentence) {
		int n = sentence.length();
		System.out.println("length: " + n);
		System.out.print(sentence.substring(n / 2, n));// here we should NOT
														// write end index as
														// n-1, bcs, the end
														// index is exclusive.
		// and for first string- substring from 0 to n/2
	}

	// Write a program to get the 3rd “ e “ of the string .
	// For example: “Welcome to Naveen Automation Labs ! “
	public void thirdE(String sentence, char letter){  //NOT DONE YET
		String words[]= sentence.split(" ");
		int flag=0;
		for(int i=0;i<words.length;i++){
			for(int j=0; j<words[i].length();j++){
				if(words[i].charAt(j)==letter){
					flag++;
				}
			}
			if (flag==3){
				//System.out.println(words[]);
			}
				
			
		}
		
		
	}
	

	// Write a method which gives an index of (-1) if string is not available. .
	// it should return integer. if String is present, then it should return the
	// specific index.
	public void indexOfMethod(String sentence, String substring, int num) {
		if (sentence.indexOf(substring, num) > 0) {
			System.out.println(sentence.indexOf(substring, num));
		} else if (sentence.indexOf(substring, num) == -1) {
			System.out.println(num);
		}

		// refer to https://www.javatpoint.com/java-string-indexof for indexOf()
		// method understanding
	}

	// Write a program that breaks a whole string into small strings, and prints
	// out its all values . (Hint: split, loop) .
	public void breaksString(String sentence) {
		String arraySplit[] = sentence.split(",");
		for (int i = 0; i < arraySplit.length; i++) {
			System.out.println(arraySplit[i]);
		}
	}

	// Assume that a string consists of 3 words, print out the middle one.
	public void middleWord(String words) {
		String word[] = words.split(" ");
		System.out.println(word[1]);
	}

	// get only numeric part from this String:
	String s = "your transaction id is: 12345 and reference id is 34567";

	public String onlyNumeric(String sentence) {
		// replacing every non-digit number with a space
		String modified = sentence.replaceAll("[^\\d]", " ");

		// now remove extra spaces from the beginning and the ending of the
		// string
		String modified1 = modified.trim();

		// replace all the consecutive white spaces with a single space
		String modified2 = modified1.replaceAll(" +", " ");

		if (modified2.equals("")) {
			return "-1";
		} else {
			return modified2;
		}

	}

	// Write a program to create a static Array, having following cricket data:
	// --name, age, team name, DOB, gender, Strike Rate
	// --Try to create multiple Object Arrays for different players
	// --Try to print all the values of each player on the console
	public void cricketData() {
		Object player1[] = new Object[5];
		player1[0] = "Sachin";
		player1[1] = 21;
		player1[2] = "Team 1";
		player1[3] = "12/3/1990";
		player1[4] = 34;
		for (int i = 0; i < player1.length; i++) {
			System.out.println(player1[i]);
		}
		System.out.println();
		Object player2[] = new Object[5];
		player2[0] = "Rahul";
		player2[1] = 22;
		player2[2] = "Team 2";
		player2[3] = "01/03/1980";
		player2[4] = 54;
		for (int j = 0; j < player2.length; j++) {
			System.out.println(player2[j]);
		}
		System.out.println();
		Object player3[] = new Object[5];
		player3[0] = "Ganguli";
		player3[1] = 31;
		player3[2] = "Team 1";
		player3[3] = "02/04/1990";
		player3[4] = 74;
		for (int k = 0; k < player1.length; k++) {
			System.out.println(player3[k]);
		}

	}

	// Try to print the following pattern on the console:
	// n = 4
	// n = 3
	// n = 2
	// n = 1
	// n = 0
	public void pattern(int num) {

		for (int i = num; i >= 0; i--) {
			System.out.println("n = " + i);

		}
	}

}
