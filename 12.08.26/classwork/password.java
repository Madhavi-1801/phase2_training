package project12;
import java.util.*;
class check{
	String mail;
	int pass;
	check(String mail,int pass){
		this.mail=mail;
		this.pass=pass;
	}
	void ans(int p)  {
		if(pass==p) {
			System.out.println("successfully login");
		}
		else {
			throw new RuntimeException("Password is wrong");
			
		}
	}
}

public class password {
	public static void main(String[] Args) {
		check c=new check("madhavi@gmail.com",45677);
		c.ans(12345);
		
	}

}
