package employee;
import java.util.*;

public class emp {



	public static void main (String[] args) {

	

		Stack<String>s=new Stack<>();

		s.push("this");

		s.push("is");

		s.push("java");

		s.push("placement");

		s.push("class");

		while(!s.isEmpty()) {

			String c=s.pop();

			String reverse="";

			for(int i=c.length()-1;i>=0;i--) {

				reverse+=c.charAt(i);

				

			}

			System.out.println(reverse);

		}

		

	}

}