package JavaRevision_Package1;

public class Java_04_01_Assignment1_MaxNumber {

	public static void main(String[] args) {
		int i =110;
		int j=330;
		int k =80;
		//initial code by myself
		if(i>j){
			if(i>k){
				System.out.println("largest number is :"+ i);
			}
			if(i<k){
				System.out.println("largest number is : "+ k);
				
			}
		}
		else{
			if(j>k){
				System.out.println("largest number is : "+ j);
			}
		}
		
		
		//Pro Code
		
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
			System.out.println("largest number is : "+c);
			}
		
		}
	
	

	}


