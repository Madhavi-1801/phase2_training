package project14;
import java.util.*;
class account{
	int accountnumber;
	String accountHolderName;
	long mobilenumber;
	String accounttype;
	int balance;
	account(int accountnumber,String accountHolderName,long mobilenumber,String accounttype,int balance){
		this.accountnumber=accountnumber;
		this.accountHolderName=accountHolderName;
		this.mobilenumber=mobilenumber;
		this.accounttype=accounttype;
		this.balance=balance;
	}
	void details() {
		System.out.println("accountnumber:"+accountnumber);
		System.out.println("Account HolderName"+accountHolderName);
		System.out.println("mobile number:"+mobilenumber);
		System.out.println("Account Type:"+accounttype);
		System.out.println("balance:"+balance);
	
	}
}

public class account_main {
	public static void main(String[] Args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of accounts");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter datails");
			System.out.println("account Number");
			System.out.println("Holder Nmae");
			System.out.println("mobilenumber");
			System.out.println("Account type");
			System.out.println("balance");
			int number=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			long mobile=sc.nextLong();
			sc.nextLine();
			String type=sc.nextLine();
			int balance=sc.nextInt();
			account a=new account(number,name,mobile,type,balance);
			a.details();
			
		}
	}

}
