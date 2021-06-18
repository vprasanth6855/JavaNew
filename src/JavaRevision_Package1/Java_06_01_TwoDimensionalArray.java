package JavaRevision_Package1;

public class Java_06_01_TwoDimensionalArray {

	public static void main(String[] args) {
		int data[][] = {{10,21,32}, {44,34,32}, {88,67,3}};
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}

	}

}
