package prooo;
class emp1{

    int employeeId;
    String employeeName;
    double basicSalary;

    double hra;
    double da;
    double bonus;
    double grossSalary;
    double tax;
    double netSalary;

    emp1(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {

        hra = basicSalary * 20 / 100;
        da = basicSalary * 10 / 100;
        bonus = basicSalary * 5 / 100;

        grossSalary = basicSalary + hra + da + bonus;

        tax = grossSalary * 8 / 100;

        netSalary = grossSalary - tax;
    }

    double getNetSalary() {
        return netSalary;
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


public class Employee1 {
	public static void main(String[] args) {

        emp1 e1 = new emp1(101, "Madhavi", 50000);
        emp1 e2 = new emp1(102, "Harini", 60000);
        emp1 e3 = new emp1(103, "Jishnu", 45000);
        emp1 e4 = new emp1(104, "Priya", 70000);
       emp1 e5 = new emp1(105, "Anu", 55000);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
        e4.calculateSalary();
        e5.calculateSalary();

        System.out.println("----- EMPLOYEE 1 -----");
        e1.display();

        System.out.println("\n----- EMPLOYEE 2 -----");
        e2.display();

        System.out.println("\n----- EMPLOYEE 3 -----");
        e3.display();

        System.out.println("\n----- EMPLOYEE 4 -----");
        e4.display();

        System.out.println("\n----- EMPLOYEE 5 -----");
        e5.display();


     
        emp1 highest = e1;
        emp1 lowest = e1;

        if (e2.getNetSalary() > highest.getNetSalary())
            highest = e2;

        if (e3.getNetSalary() > highest.getNetSalary())
            highest = e3;

        if (e4.getNetSalary() > highest.getNetSalary())
            highest = e4;

        if (e5.getNetSalary() > highest.getNetSalary())
            highest = e5;


        if (e2.getNetSalary() < lowest.getNetSalary())
            lowest = e2;

        if (e3.getNetSalary() < lowest.getNetSalary())
            lowest = e3;

        if (e4.getNetSalary() < lowest.getNetSalary())
            lowest = e4;

        if (e5.getNetSalary() < lowest.getNetSalary())
            lowest = e5;


        // Average salary
        double total = e1.getNetSalary()
                      + e2.getNetSalary()
                      + e3.getNetSalary()
                      + e4.getNetSalary()
                      + e5.getNetSalary();

        double average = total / 5;


        System.out.println("\n----- RESULT -----");

        System.out.println(
            "Highest Salary : " +
            highest.employeeName + " - ₹" +
            highest.getNetSalary()
        );

        System.out.println(
            "Lowest Salary  : " +
            lowest.employeeName + " - ₹" +
            lowest.getNetSalary()
        );

        System.out.println(
            "Average Salary : ₹" + average
        );
    }
}
	



