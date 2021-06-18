package JavaRevision_Package1;

public class Java_10_02_Assignment2 {

	public static void main(String[] args) {
		Java_10_02_Assignment2 obj = new Java_10_02_Assignment2();
		boolean isPrime = obj.isPrime(12);
		if (isPrime == true) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");
		}

		int number = obj.enterAnyNumber(18);
		System.out.println("Entered number is : " + number);

		String toBePrinted = obj.printingNTimes("Madhav and Neerav");
		for (int i = 1; i <= 30; i++) {
			System.out.println(toBePrinted);
		}

		int numberArray[] = obj.singleArray();
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}

		int numbers[][] = obj.multiArray();
		System.out.println(numbers[0][0]);

		int smallest = obj.smallestNum();
		System.out.println("The smallest number is : " + smallest);

		int largest = obj.largestNum();
		System.out.println("largest number is : " + largest);
		
		int even[] = obj.evenNum();
		System.out.println("Even numbers are : ");
		for(int i=0; i<even.length; i++){
			if(even[i]%2==0){
				System.out.println(even[i]+ " ");
			}
		}
		
		boolean isLeapYear= obj.leapYear(2021);
		if(isLeapYear==true){
			System.out.println("The given year " + " is leap year!");
		}
		else{
			System.out.println("The given year " + " is not leap year!");
		}
		
		boolean isArmstrongNum = obj.armstrongNum(153);
		if(isArmstrongNum==true){
			System.out.println("The given number is "+ "Armstrong");
		}
		else{
			System.out.println("The given number is "+ "not Armstrong");
		}
		
		boolean isAdams = obj.adamsNum(12);
		if(isAdams==true){
			System.out.println("Number is : "+"Adam's number");
		}
		else{
			System.out.println("Number is : "+"not Adam's");
		}
		
		int sum = obj.sum(12, 12);
		System.out.println("sum is : "+sum);
		
		obj.arithmetic(4, 2);
		
		obj.compoundOp(4, 2);
		
		obj.numbers(18);
		
		obj.multiplicaionTable(2);
		
		int reverse = obj.reversing(155);
		System.out.println("reverse is : "+ reverse);
		
		int sumOfN = obj.sumOfNaturalNum(5);
		System.out.println("sum of those natural numbers is : "+ sumOfN);

	}

	// Prime or not MOre improved method for easy understandability
	public boolean isPrime(int num) {
		int flag = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				flag++;
			}

		}
		if (flag == 2) {
			return true;
		} else {
			return false;
		}
	}

	// Method to see the output that what has been user entered in the input
	// field
	public int enterAnyNumber(int num) {
		return num;
	}

	// print something n times
	public String printingNTimes(String name) {
		return name;
	}

	// single dimensional array
	public int[] singleArray() {
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		return i;

	}

	// multi Dimensional Array
	public int[][] multiArray() {
		int i[][] = { { 1, 2, 3 }, { 9, 8, 7 } };

		return i;

	}

	// finding smallest number
	public int smallestNum() {
		int num[] = new int[4];
		num[0] = 0;
		num[1] = 34;
		num[2] = 20;
		num[3] = 30;

		int s;
		s = num[0];
		for (int i = 0; i < num.length; i++) {
			if (s > num[i]) {
				s = num[i];
			}
		}
		return s;

	}

	// finding largest number
	public int largestNum() {
		int num[] = new int[4];
		num[0] = 0;
		num[1] = 10;
		num[2] = 20;
		num[3] = 30;

		int l;
		l = num[0];

		for (int i = 0; i < num.length; i++) {
			if (l < num[i]) {
				l = num[i];
			}
		}
		return l;
	}

	// Print all the even numbers that entered

	public int[] evenNum() {
		int num[] = new int[4];
		num[0] = 1;
		num[1] = 4;
		num[2] = 5;
		num[3] = 6;
		
		return num;
	}
	
	//finding leap year
	public boolean leapYear(int year){
		if((year%4==0 && year%100!=0) || year%400==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//finding Armstrong Number
	public boolean armstrongNum(int num){
		int r, sum = 0;
		int temp = num;
		while(num!=0){
			r=num%10;
			sum = sum+r*r*r;
			num=num/10;
		}
		if(sum==temp){
			return true;
		}
		else{
			return false;
		}
	}
	
	//finding Adam's number
	public boolean adamsNum(int num){
		int r,r1, s=0, s1=0;
		int sqaureOfActualNum = num*num;
		int temp = sqaureOfActualNum;
		while(num!=0){
			r=num%10;
			s=(s*10)+r;
			num=num/10;
		}
		int squareOfReverseNum=s*s;
		while(squareOfReverseNum!=0){
			r1=squareOfReverseNum%10;
			s1=(s1*10)+r1;
			squareOfReverseNum=squareOfReverseNum/10;
		}
		
		if(temp==s1){
			return true;
		}
		else{
			return false;
		}
	}
	
	//finding sum
	public int sum(int n1, int n2){
		int sum = n1+n2;
		return sum;
	}
	
	//arithmetic operation
	public void arithmetic(int n1, int n2){
		int sum = n1+n2;
		int substraction = n1-n2;
		int multiplication = n1*n2;
		int division = n1/n2;
		int modules = n1%n2;
		
		System.out.println("sum is "+ sum + " and "+ "substracted is "+substraction+ " and "+ " multiplied product is "+ multiplication +" and " + "divided product is "+ division + " and "+"module is "+modules );
	}
	
	//compound operator
	public void compoundOp(int n1, int n2){
		 System.out.println(n1+=n2);  //n1 is n1+n2
		 System.out.println(n1-=n2);    //n1= n1-n2
		 System.out.println(n1*=n2);    //n1 is n1*n2
		 System.out.println(n1/=n2);   //n1 is n1/n2
	}
	
	//printing numbers up to n
	public void numbers(int num){
		for(int i=0; i<=num; i++){
			System.out.println(i+ " ");
		}
	}
	
	//multiplication table
	public void multiplicaionTable(int num){
		for(int i=1; i<=10; i++){
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	
	//reversing a number
	public int reversing(int num){
		int r, s =0;
		while(num!=0){
			r = num%10;
			s= (s*10)+r;
			num=num/10;
		}
		return s;
	}
	
	//sum of first n natural numbers
	public int sumOfNaturalNum(int num){
		int s=0;
		for(int i=1; i<=num;i++){
			s=s+i;
		}
		return s;
	}

}
