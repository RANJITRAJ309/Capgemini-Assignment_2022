import java.util.HashSet;

class Employee{
	int id;
	int salary;
	String name;
	String department;
	public Employee(int id,String name,int salary,String department) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	
	}

	public void displayDetails() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
		System.out.println();
	}
}
public class GenericsQ1 {

	public static void main(String[] args) {
		HashSet<Employee> myHashset=new HashSet<>();
		Employee E1=new Employee(101,"Alsisa",100000,"IT");
		Employee E2=new Employee(103,"Kalal",200000,"HR");
		Employee E3=new Employee(102,"Reshna",500000,"IT");
		Employee E4=new Employee(104,"Ranjit Raj",1000000,"HR");
		myHashset.add(E1);
		myHashset.add(E2);
		myHashset.add(E3);
		myHashset.add(E4);
		E1.displayDetails();
		E2.displayDetails();
		E3.displayDetails();
		E4.displayDetails();
		System.out.println(myHashset);
		

	}

}
