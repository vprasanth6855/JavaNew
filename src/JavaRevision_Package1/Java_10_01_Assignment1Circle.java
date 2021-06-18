package JavaRevision_Package1;

public class Java_10_01_Assignment1Circle {

	public static void main(String[] args) {
		Java_10_01_Assignment1Circle obj = new Java_10_01_Assignment1Circle();

		Double circleCircumference = obj.circumferance(12);
		System.out.println("Circle Circumference is : " + circleCircumference);

		Double circleArea = obj.area(12);
		System.out.println("Circle area is : " + circleArea);

		int sum = obj.sum(12, 14);
		System.out.println("sum is :" + sum);

		int product = obj.product(2, 3);
		System.out.println("product is : " + product);

		int minimum = obj.minimumAmongThree(12, 10, 900);
		System.out.println("Minimum number is : " + minimum);

		int input = 113; // This is also possible, JUST NOTE. so that we can
							// print in the console that entered number <n> is
							// odd or even
		boolean verify = obj.EvenOrOdd(input);
		if (verify == true) {
			System.out.println("number " + input + " is even");
		} else {
			System.out.println("number " + input + " is odd");
		}

		int age = 10;
		boolean isEligible = obj.isEligible(age);
		if (isEligible == true) {
			System.out.println("Person with age " + age + " is eligible for voting");
		} else {
			System.out.println("Person with age " + age + " is NOT eligible for voting");
		}

		boolean Number = obj.isPrime(13);
		if (Number == true) {
			System.out.println(" Number is Prime");
		} else {
			System.out.println("Number is not prime");
		}

		String grade = obj.getGrade(78);
		System.out.println(" Grade is : " + grade);
		
		int factorial = obj.factorial(4);
		System.out.println("factorial is : "+ factorial);

	}

//finding circumference of a circle
	public Double circumferance(int radius) {

		double circum = 2 * 3.14 * radius;
		return circum;

	}

//finding area of a circle
	public Double area(int radius) {

		double area = 3.14 * (radius * radius);
		return area;
	}

//finding sum
	public int sum(int a, int b) {
		int d = a + b;
		return d;
	}

//finding product
	public int product(int a, int b) {
		int d = a * b;
		return d;
	}
//finding minimum number among three
	public int minimumAmongThree(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < c) {
			return b;
		} else {
			return c;
		}
	}
	
//finding even or odd
	public boolean EvenOrOdd(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
//finding eligibility
	public boolean isEligible(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime(int number) { //better code is coming later
		int i = 2;
		boolean flag = false;
		while (i <= number / 2) {
			if (number % i == 0) {
				flag = true;
				break;
			}
			i++;
		}
		if (!flag) {
			return true;
		} else {
			return false;
		}
	}

//finding grades
	public String getGrade(int mark) {
		if (mark >= 91 && mark <= 100) {
			return "AA";
		} else if (mark >= 81 && mark <= 90) {
			return "AB";
		} else if (mark >= 71 && mark <= 80) {
			return "BB";
		} else if (mark >= 61 && mark <= 70) {
			return "BC";
		} else if (mark >= 51 && mark <= 60) {
			return "CD";
		} else if (mark >= 41 && mark <= 50) {
			return "DD";
		} else {
			return "FAIL";
		}
	}

//finding factorial
	public int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact*i;

		}
		return fact;
		
	}
	
	

}
