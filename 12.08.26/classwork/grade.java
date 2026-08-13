package project12;
import java.util.*;
class student{
	int mark;
	student(int mark){
		this.mark=mark;
	}
	void calculate_mark() throws RuntimeException {
		if(mark>=85) {
			System.out.println("grade:o");
		}
		else if(mark>=75) {
			System.out.println("A");
		}
		else if(mark>=35) {
			System.out.println("B");
		}
		else {
			throw new RuntimeException();
			
		}
	}
}


public class grade {
	public static void main(String[] args) {
	student s=new student(-2);
	try {
	s.calculate_mark();
	}
	catch (Exception e) {
		System.out.println("mark should within the range(0-100)");
	}
	}

}
