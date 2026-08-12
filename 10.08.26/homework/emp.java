package prooo;


 class Employee {

    int employeeId;
    String employeeName;
    double basicSalary;

    double hra;
    double da;
    double bonus;
    double grossSalary;
    double tax;
    double netSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;

     
        hra = basicSalary * 20 / 100;
        da = basicSalary * 10 / 100;
        bonus = basicSalary * 5 / 100;

        grossSalary = basicSalary + hra + da + bonus;

        tax = grossSalary * 8 / 100;

        netSalary = grossSalary - tax;
    }

    void display() {

        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Tax           : " + tax);
        System.out.println("Net Salary    : " + netSalary);
    }
}

public class emp {
	 public static void main(String[] args) {

	        Employee e1 = new Employee(101, "Madhavi", 50000);
	        Employee e2 = new Employee(102, "Harini", 60000);

	        e1.display();

	        System.out.println("---------------------");

	        e2.display();
	    }

}
