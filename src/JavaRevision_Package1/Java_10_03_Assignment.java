package JavaRevision_Package1;

public class Java_10_03_Assignment {

	public static void main(String[] args) {
		Java_10_03_Assignment obj = new Java_10_03_Assignment();
		obj.swaping(4, 2);

		obj.grade('D');

		obj.averageOddEven();

		obj.floyds(5);

		obj.rootQuadratic(3, 6, 1);

		obj.operation(2, 3);

		obj.address();

		obj.compare(45, 54);

		obj.swapingWithoutTemp(4, 5);

		obj.convert((float) 12.0);

		obj.month(10);

		obj.hourMinuteSecond(3661);

		obj.primeSequence(20);

		obj.convertCm(20);

		obj.stars(5);

		obj.onetwoPyramid(5);

		double sum = obj.sumOfFraction(5);
		System.out.println(sum);

		obj.fibonacci(10);

		obj.ten();

		obj.reverseOneTwoPyramid(5);

		obj.generalPyramid(10);

		obj.onetwogeneralPyramid(10);

		obj.reverseOneTwoGeneralPyramid(10);

		obj.evenList();

		obj.sumOfDigits(34);

		obj.chooseOperation(6, 2, "Substraction");

		int sumN = obj.sumOfNNaturalNumbers(10);
		System.out.println(sumN);

		obj.listpalindrom();

		obj.alphabet('p');

		obj.ascending();

		obj.descending();

		obj.arraySumAverage();

		obj.arraySumAverage();

		obj.countArrayEvenOdd();

		obj.numberAndStars();

		obj.printNextDay(10, 11, 2020);

	}

	// swaping
	public void swaping(int n1, int n2) {
		int temp1 = n1;

		n1 = n2;
		n2 = temp1;

		System.out.println("so the swap is : " + n1 + " " + n2);
	}

	// entering the grade and printing the comments
	public void grade(char grade) {
		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Very Good!");
			break;
		case 'C':
			System.out.println("Good!");
			break;
		default:
			System.out.println("Not Bad!");
			break;
		}
	}

	// Finding average of even and odd numbers separately
	public void averageOddEven() {
		int num[] = new int[5];
		num[0] = 2;
		num[1] = 5;
		num[2] = 3;
		num[3] = 6;
		num[4] = 1;

		float es = 0, os = 0, n = 0, m = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {
				n = n + 1;
				es = es + num[i];
			}
			if (num[i] % 2 == 1) {
				m = m + 1;
				os = os + num[i];
			}
		}

		System.out.println("Average of even numbers is : " + es / n);
		System.out.println("Average of odd numbers is : " + os / m);

	}

	// printing floyds triangle
	public void floyds(int num) {
		int a = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a = a + 1;
			}
			System.out.println();

		}

	}

	// Roots of a quadratic equation
	public void rootQuadratic(int a, int b, int c) {
		int d;
		double r1, r2;
		d = (b * b) - (4 * a * c);
		if (d > 0) {
			r1 = -b + Math.sqrt(d) / (2 * a); // IMPT-NOTE-Math.sqrt() method
			r2 = -b - Math.sqrt(d) / (2 * a);

			System.out.println("Roots are : " + r1 + " " + r2);
		} else if (d == 0) {
			r1 = -b / (2 * a);

			System.out.println("Roots are : " + r1);
		} else {
			System.out.println("Roots cannot be found");
		}
	}

	// finding sum, average, and the sum of the squares
	public void operation(int n1, int n2) {
		double s, q;
		double a;

		s = n1 + n2;
		a = (s / 2);
		q = (n1 * n1) + (n2 * n2);

		System.out.println("Sum is : " + s);
		System.out.println("Average is : " + a);
		System.out.println("sum of squares is : " + q);
	}

	// printing address line by line
	public void address() {
		System.out.println("Veena Prasanth");
		System.out.println("6890 Woodland");
	}

	// comparison between numbers
	public void compare(int n1, int n2) {
		if (n1 == n2) {
			System.out.println(n1 + " is same as " + n2);
		} else if (n1 > n2) {
			System.out.println(n1 + " is greater than " + n2);
		} else {
			System.out.println(n2 + " is greater than " + n1);
		}
	}

	// swaping without using a temperory variable
	public void swapingWithoutTemp(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("swapped :" + a + " " + b);
	}

	// converting degree celsius to fahrenheit
	public void convert(float n1) {
		float f;
		f = ((9 * n1) + 160) / 5; // IMPORANT ALSO FIND OUT DEGREE CELSIUS
									// EQUATION
		// c=((5*f)-160)/9

		System.out.println("The temperature in Fahrenheit is : " + f);
	}

	// printing the name of the month for the given number
	public void month(int n1) {
		switch (n1) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;

		default:
			System.out.println("Month cannot be found");
			break;
		}
	}

	// input integer in number of seconds and find out time in hours, minutes,
	// and seconds
	public void hourMinuteSecond(int num) {
		int r, h, m, s;

		r = num % 3600;
		h = num / 3600;
		m = r / 60;
		s = r % 60;

		System.out.println(h + " hour " + m + " minute " + s + " seconds ");
	}

	// printing sequence of prime numbers
	public void primeSequence(int num) {

		int i, j;

		for (i = 1; i <= num; i++) {
			//int temp = i;
			int flag = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					flag++;
				}
			}
			if (flag == 2) {
				System.out.print(i + " ");
			}

		}

	}

	// converting cm to inches and feet
	public void convertCm(int num) {
		float i, f;
		i = (float) (num / 2.54);
		f = i / 12;

		System.out.println(i + " inches " + "and " + f + " feet");
	}

	// printing pyramid of stars
	public void stars(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// printing 1+1/2+..1/n
	public double sumOfFraction(int num) {

		double s = 0;

		for (int i = 1; i <= num; i++) {
			s = s + (1 / i);
		}

		return s;
	}

	// printing Fibonacci numbers
	public void fibonacci(int num) {
		int a, b;
		a = 0;
		b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 1; i <= num - 2; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}

	}

	// printing smallest and largest of 10 inputed numbers
	public void ten() {
		int s, l, i;
		int num[] = new int[10];
		num[0] = 2;
		num[1] = 4;
		num[2] = 1;
		num[3] = 7;
		num[4] = 11;
		num[5] = 2;
		num[6] = 2;
		num[7] = 2;
		num[8] = 2;
		num[9] = 2;

		s = num[0];
		for (i = 0; i < num.length; i++) {
			if (s > num[i]) {
				s = num[i];
			}
		}
		System.out.println("smallest is : " + s);

		l = num[0];
		for (i = 0; i < num.length; i++) {
			if (l < num[i]) {
				l = num[i];
			}
		}
		System.out.println("Largest is : " + l);

	}

	// printing 1 2 pyramid
	public void onetwoPyramid(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// printing 1 2 pyramid reverse
	public void reverseOneTwoPyramid(int num) {
		int temp = num;
		for (int i = 1; i <= temp; i++) {

			for (int j = 1; j <= num; j++) {
				System.out.print(j + " ");
			}
			num = num - 1;
			System.out.println();
		}
	}

	// general pyramids method
	public void generalPyramid(int num) {
		int i, j, a = 0;
		for (i = 1; i <= num; i++) {
			for (j = 1; j <= i; j++) {
				a = a + 1; // by using this we can print even odd etc like this
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	// general Pyramid one two
	public void onetwogeneralPyramid(int num) {
		int i, j, a = 0; // we can take this a=0 off here
		for (i = 1; i <= num; i++) {
			a = 0;
			for (j = 1; j <= i; j++) {
				a = a + 1;
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	// general pyramid one two reverse
	public void reverseOneTwoGeneralPyramid(int num) {
		int i, j, a = 0;
		int temp = num;
		for (i = 1; i <= temp; i++) {
			a = 0;
			for (j = 1; j <= num; j++) {
				a = a + 1;
				System.out.print(a + " ");
			}
			num = num - 1;
			System.out.println();
		}
	}

	// Display the even numbers between 1-20 and also display the count
	public void evenList() {
		int n = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
				n = n + 1;
			}
		}
		System.out.println("The count is : " + n);
	}

	// sum of the digits of given number
	public void sumOfDigits(int num) {
		int r, s = 0;
		while (num != 0) {
			r = num % 10;
			s = s + r;
			num = num / 10;
		}

		System.out.println("sum of digits : " + s);
	}

	// entering two numbers and choose the operation and do the operation
	// accordingly
	public void chooseOperation(int n1, int n2, String operation) {

		switch (operation) {
		case "Addition":
			System.out.println(n1 + n2);
			break;
		case "Substraction":
			System.out.println(n1 - n2);
			break;
		case "Multiplication":
			System.out.println(n1 * n2);
			break;
		case "Division":
			System.out.println(n1 / n2);
			break;

		default:
			break;
		}
	}

	// sum of n natural numbers
	public int sumOfNNaturalNumbers(int num) {
		int s = 0;
		for (int i = 1; i <= num; i++) {
			s = s + i;
		}
		return s;
	}

	// print all the palindrom numbers in 1-100
	public void listpalindrom() {
		for (int i = 1; i <= 100; i++) {
			int temp = i;
			int r, s = 0;
			while (temp != 0) {
				r = temp % 10;
				s = (s * 10) + r;
				temp = temp / 10;
			}
			if (i == s) {
				System.out.println(i);
			}
		}
	}

	// checking whether alphabet is vowel or not
	public void alphabet(char letter) {
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
				|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println("Character is vowel");
		} else {
			System.out.println("Character is not vowel");
		}
	}

	// ascending order
	public void ascending() {

		int num[] = new int[5];
		num[0] = 8;
		num[1] = 2;
		num[2] = 9;
		num[3] = 1;
		num[4] = 5;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.println(num[i]);
		}
	}

	// descending order
	public void descending() {
		int num[] = new int[5];
		num[0] = 8;
		num[1] = 2;
		num[2] = 5;
		num[3] = 1;
		num[4] = 9;

		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.println(num[i]);
		}
	}

	// store 10 numbers to an array and find teh sum and average
	public void arraySumAverage() {
		int num[] = new int[10];
		num[0] = 2;
		num[1] = 3;
		num[2] = 5;
		num[3] = 8;
		num[4] = 4;
		num[5] = 2;
		num[6] = 2;
		num[7] = 1;
		num[8] = 1;
		num[9] = 1;

		int s = 0;
		int n = 0;
		for (int i = 0; i < num.length; i++) {
			s = s + num[i];
			n = n + 1; // here instead of calculating n=n+1, we can take
						// num.length which is more professional
		}
		System.out.println("sum is : " + s);
		double average = (double) s / (double) (n); // IMPORTANT. This is how we
													// can convert two int to
													// double
		System.out.println("average is :" + average);

	}

	// store 10 numbers to an array and get the count of even numbers and odd
	// numbers
	public void countArrayEvenOdd() {
		int num[] = new int[10];
		num[0] = 1;
		num[1] = 9;
		num[2] = 11;
		num[3] = 12;
		num[4] = 14;
		num[5] = 5;
		num[6] = 6;
		num[7] = 9;
		num[8] = 3;
		num[9] = 1;

		int e = 0;
		int o = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				e = e + 1;
			} else {
				o = o + 1;
			}
		}
		System.out.println("even count is : " + e);
		System.out.println("Odd count is : " + o);

	}

	// store any 10 numbers and print the same number of stars in front of it
	public void numberAndStars() {
		int num[] = new int[10];
		num[0] = 2;
		num[1] = 4;
		num[2] = 6;
		num[3] = 8;
		num[4] = 10;
		num[5] = 12;
		num[6] = 14;
		num[7] = 16;
		num[8] = 18;
		num[9] = 20;

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			for (int j = 1; j <= num[i]; j++) { // see here j=1, if j=0, it will
												// always print one extra star
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// printing the next day
	public void printNextDay(int m, int d, int y) {
		int m1, d1, y1;

		m1 = m;
		d1 = d;
		y1 = y;
		if (m == 2) {
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
				if (m == 2) {
					if (d > 0 && d < 29) {
						d1 = d1 + 1;
					} else if (d == 29) {
						d1 = 1;
						m1 = m1 + 1;
					}

				}
			} else {
				if (d > 0 && d > 28) {
					d1 = d1 + 1;
				}
				if (d == 28) {
					d1 = 1;
					m1 = m1 + 1;
				}
			}
		}
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			if (d > 0 && d < 31) {
				d1 = d1 + 1;
			}
			if (d == 31) {
				d1 = 1;
				m1 = m1 + 1;
			}
			if (d == 31 && m == 12) {
				m1 = 1;
				y1 = y1 + 1;
			}
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			if (d > 0 && d < 30) {
				d1 = d1 + 1;
			} else if (d == 30) {
				d1 = 1;
				m1 = m1 + 1;
			}
		}

		System.out.println("The following date is : " + m1 + "/" + d1 + "/" + y1);
	}

	// matrix multiplication
	public void matrix() { // will do later
		int num1[][] = { { 1, 2 }, { 3, 4 } };
		int num2[][] = { { 5, 6 }, { 7, 8 } };

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {

			}
		}
	}
}
