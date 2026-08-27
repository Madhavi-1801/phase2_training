package employee;
import java.util.*;
class employee{
	int id;
	String name;
	employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
	}
}

public class main {

	public static void main (String[] args) {
		employee e1=new employee(89,"raj");
		employee e2=new employee(90,"arun");
		employee e3=new employee(72,"rani");
		employee e4=new employee(67,"arul");
		employee e5=new employee(9,"jai");
	
		Stack<employee>s=new Stack<>();
	    s.push(e1);
	    s.push(e2);
	    s.push(e3);
	    s.push(e4);
	    s.push(e5);
	    while(!s.isEmpty()) {
	    	s.pop().display();
	    }
		
	}
}
