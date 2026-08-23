package project14;
import java.util.*;

public class deposite_main {
	public static void main(String[] Args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to deposite");
		int amount=sc.nextInt();
		int current_balance=100000;
		if(amount<=0) {
			System.out.println("Invalid deposite amount ");
			
		}
		else {
			System.out.println("Successfully deposited");
			System.out.println("your current account balance:"+(current_balance+amount));
		}
		
	}

}
