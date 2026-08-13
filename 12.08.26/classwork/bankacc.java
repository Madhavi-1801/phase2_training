package project12;
import java.util.*;
class bank1{
	int balance;
	bank1(int balance){
		this.balance=balance;
	}
	void withdraw(int amt) throws Exception {
		if(amt<balance) {
			System.out.println("current balance:"+(balance-amt));
		}
		else {
			throw new Exception();
		}
	}
}

public class bankacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 b=new bank1(1000);
		try {
		b.withdraw(800000);
		}
		catch(Exception e) {
			System.out.println("insufficient balance");
		}
		

	}

}
