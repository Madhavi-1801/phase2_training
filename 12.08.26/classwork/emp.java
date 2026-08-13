package project12;
abstract class Employee{
	private String name;
	private int salary;
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	String getName() {
		return name;
	}
	int getSalary() {
		return salary;
	}
    abstract void Bonus_Call();
	abstract void display_all();
	
}
class developer extends Employee{
	void Bonus_Call() {
		System.out.println("developer bonus");
	}
	void display_all() {
		System.out.println("name:"+getName());
		System.out.println("Salary:"+getSalary());
	}
	
}
class full_stack extends developer{
	void Bonus_Call() {
		System.out.println("bonus for full stack developer is:"+getSalary()*2);
	}
	
}
class mern_stack extends developer{
	void Bonus_Call() {
		int s=getSalary()*2;
		System.out.println("bonus for MERN stack developer is:"+s);
		System.out.println("total salary:"+(s+getSalary()));
	}
	
}
class manager extends Employee{
	void Bonus_Call() {
		System.out.println("bonus for manager is:"+getSalary()*3);
	}
    void display_all() {
    	System.out.println(getName());
		System.out.println(getSalary());
    	
    }
}
class worker extends Employee{
	void Bonus_Call() {
		System.out.println("bonus for Worker is"+getSalary());
	}
	   void display_all() {
	    	System.out.println(getName());
			System.out.println(getSalary());
	    	
	    }
}


public class emp {
	public static void main(String[] args) {
		mern_stack m=new mern_stack();
		developer d=new developer();
		d.setName("madhavi");
		d.setSalary(900000);
		d.display_all();
		m.setName("madhavi");
		m.setSalary(900000);
		m.Bonus_Call();
		
		
	}

}
