package JavaRevision_Package1;

public class Java_19_02_withDataConversion {

	public static void main(String[] args) {
		//parsing integer
		String x ="100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//parsing double
		String y = "12.33";
		System.out.println(y+100);
		
		double d = Double.parseDouble(y);
		System.out.println(d+100);
		
		//parsing integer from string that contains alphanumeric
		String z = "100A";
		System.out.println(z+100);
		
		String z1 = z.replaceAll("[^\\d]", "");//first replace the alpha
		
		int a =Integer.parseInt(z1);
		System.out.println(a+100);
		
		//converting int to string
		int m =100;
		System.out.println(m+20);
		String m1 = String.valueOf(m);
		System.out.println(m1+20);

	}

}
