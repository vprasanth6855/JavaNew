package JavaRevision_Package1;

public class Java_13_02_EmployeeTestEncapsulation {

	public static void main(String[] args) {
		Java_13_01_EmployeeDataEncapsulation obj = new Java_13_01_EmployeeDataEncapsulation("Beena", "3423",34, "Sales", 3005);
        System.out.println(obj.name);
        //System.out.println(obj.sal....);
        //obj.getEmployeeName();
        //obj.get.....
        
        
        obj.setSalary(3000);
        System.out.println(obj.getSalary());
        
        obj.getEmployeeName();
	}

}
