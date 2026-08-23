package project13;
import java.util.*;
class InvalidMarkException extends RuntimeException{
	public InvalidMarkException(String error) {
		super(error);
	}
}
class InsufficientMarkException extends RuntimeException{
	public InsufficientMarkException(String error) {
		super(error);
	}
}
class ArrayException extends Exception{
	public ArrayException(String error) {
		super(error);
	}
}
class m{
	int[] mark;
	m(int[] mark){
		this.mark=mark;
	}
	void length_check() throws ArrayException {
		if(mark.length>5) {
			throw new ArrayException("length should be less than 5");
		}
		else {
			System.out.println("total subjects:"+mark.length);
		}
	}
	void check() {
		int sum=0;
		for(int i=0;i<mark.length;i++) {
			if(mark[i]>100) {
				throw new InvalidMarkException("mark should lesser than 100");
			}
			else if(mark[i]<0) {
				throw new InsufficientMarkException("mark should greater than 0");
			}
			else {
				sum+=mark[i];
				
			}
		}
		System.out.println("Average of marks"+(sum/mark.length));
	}
}

public class mark_main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] mark=new int[n];
		for(int i=0;i<n;i++) {
			mark[i]=sc.nextInt();
		}
		m s=new m(mark);
		try {
		s.length_check();
		}
		catch(ArrayException e){
			System.out.println(e.getMessage());
			
		}
		s.check();
		

	}

}
