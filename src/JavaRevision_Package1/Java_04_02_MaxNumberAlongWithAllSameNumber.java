package JavaRevision_Package1;

public class Java_04_02_MaxNumberAlongWithAllSameNumber {

	public static void main(String[] args) {
		int a = 110;
		int b = 110;
		int c = 110;
		
		if(a>b && a>c){
			System.out.println("largest number is : "+a);
		}
		else if(b>c){
			System.out.println("largest number is : "+ b);
		}
		else{
			if(a==b && a==c && b==c){
				System.out.println("Numbers are same");
			}
			else{
			System.out.println("largest number is : "+c);
			}
		}

	}

}
