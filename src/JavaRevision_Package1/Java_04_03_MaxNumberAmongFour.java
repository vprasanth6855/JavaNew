package JavaRevision_Package1;

public class Java_04_03_MaxNumberAmongFour {

	public static void main(String[] args) {
		int a =80;
		int b = 120;
		int c = 330;
		int d = 40;
		
		if(a>b && a>c && a>d)
		{
			System.out.println("largest number is : "+ a);
		}
		else if (b>c && b>d){
			System.out.println("largest number is : "+ b);
		}
		else if(c>d){
			System.out.println("largest number is : "+c);
		}
		else{
			System.out.println("largest number is : "+d);
		}

	}

}
