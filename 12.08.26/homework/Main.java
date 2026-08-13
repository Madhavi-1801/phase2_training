package java1;
abstract class Employee{
	private int id;
	private String name;
	private int BaseSalary;
	void setId(int id) {
		this.id=id;
	}
	void setName(String name) {
		this.name=name;
	}
	void setBasicSalary(int BaseSalary) {
		this.BaseSalary=BaseSalary;
	}
	String getName() {
		return name;
	}
	int getId() {
		return id;
	}
	int getBaseSalary() {
		return BaseSalary;
	}
	abstract void calculateSalary(int b);
	void diplaydetails() {
		System.out.println("name:"+getName());
		System.out.println("Id:"+getId());
	}
	
}
class Doctor extends Employee{
	void calculateSalary(int allowance) {
		int salary=getBaseSalary()+allowance;
		System.out.println("Salary:"+salary);
	}


}
class Nurse extends Employee{
	void calculateSalary(int nightshiftallowance) {
		int salary=getBaseSalary()+nightshiftallowance;
		System.out.println("Salary:"+salary);
	}
	
}
class Lab_tech extends Employee{
	void calculateSalary(int laballowance) {
		int salary=getBaseSalary()+laballowance;
		System.out.println("Salary:"+salary);
	}
}
public class Main {

	public static void main(String[] args) {
		
		Employee [] obj=new Employee[3];

		        obj[0] = new Doctor();
		        obj[1] = new Nurse();
		        obj[2] = new Lab_tech();

		        obj[0].setName("Madhavi");
		        obj[0].setId(1);
		        obj[0].setBasicSalary(8000);

		        obj[1].setName("Harini");
		        obj[1].setId(2);
		        obj[1].setBasicSalary(9000);

		        obj[2].setName("Jishnu");
		        obj[2].setId(3);
		        obj[2].setBasicSalary(10000);

		        obj[0].diplaydetails();
		        obj[0].calculateSalary(2000);

		        obj[1].diplaydetails();
		        obj[1].calculateSalary(3000);

		        obj[2].diplaydetails();
		        obj[2].calculateSalary(4000);
		    }
				
				
				
				

			}

		
		
		

	


