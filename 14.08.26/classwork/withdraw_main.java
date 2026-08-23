package project14;
import java.util.*;

public class withdraw_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdraw amount");
		int amount=sc.nextInt();
		int balance=900000;
		if(amount<=0) {
			System.out.println("invalid withdrawal amount");
		}
		else if(amount>balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			System.out.println("Successfully Withdrawed");
			System.out.println("your current balance:"+(balance-amount));
		}

	}

}
