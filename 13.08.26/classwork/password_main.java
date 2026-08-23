package project13;
import java.util.*;


class InvalidPasswordException extends Exception{
	InvalidPasswordException(String error){
		super(error);
	}
}
class IncorrectPasswordException extends Exception{
	IncorrectPasswordException(String error){
		super(error);
	}
}

class password{
	String password="user@1234";
    void password_check(String pass) throws InvalidPasswordException,IncorrectPasswordException {
    	if(pass.length()!=password.length()) {
    		throw new InvalidPasswordException("password length is incorrect");
    	}
    	else if(!(pass.equals(password))) {
    		throw new IncorrectPasswordException("password is incorrect");
    	}
    	else {
    		System.out.println("password is correct");
    	}
    }
    
}

public class password_main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String pass=sc.nextLine();
	password p=new password();
	try {
	p.password_check(pass);
	}
	catch(InvalidPasswordException e) {
		System.out.println(e.getMessage());
	}
	catch(IncorrectPasswordException e) {
		System.out.println(e.getMessage());
	}
}
}
