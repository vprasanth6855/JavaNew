package JavaRevision_Package1;

public class Java_13_01_EmployeeDataEncapsulation {
	public String name;
	public String id;
	public int age;
	public String dept;
	private int salary;
	
	
	
	public Java_13_01_EmployeeDataEncapsulation(String name, String id, int age, String dept, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	public void getEmployeeName(){
		System.out.println("Employee Name");
		getEmployeeBonus(); //for accessing private method -3
	}
	private void getEmployeeBonus(){
		System.out.println("Employee Bonus");
	}
	public int getSalary(){       //get method for variable -1
		return salary;
	}
	public void setSalary(int salary){ //set method for variable -2
		this.salary = salary;
	}
	public static void main(String[] args) {
		Java_13_01_EmployeeDataEncapsulation obj = new Java_13_01_EmployeeDataEncapsulation("Reena", "1234", 24, "Sales", 3000);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		obj.getEmployeeName();
		obj.getEmployeeBonus();
		
	}

}
