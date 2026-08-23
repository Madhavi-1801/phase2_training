package project14;
import java.util.*;
class bank{
	static String name="mariamman bank name ";
	int accountnumber;
	String holdername;
	int balance;
	bank(int accountnumber,String holdername,int balance){
		this.accountnumber=accountnumber;
		this.holdername=holdername;
		this.balance=balance;
	}
	void display() {
		System.out.println("branch name:"+name);
		System.out.println("accountnumber:"+accountnumber);
		System.out.println("holdername:"+holdername);
		System.out.println("balance:"+balance);
	}
	
	
}

public class bank_main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of accounts");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("enter holdername,accountnumber,balance");
		sc.nextLine();
		String name=sc.nextLine();
		int number=sc.nextInt();
	    int balance=sc.nextInt();
	    bank b=new bank(number,name,balance);
	    b.display();
		}
		
	}

}
