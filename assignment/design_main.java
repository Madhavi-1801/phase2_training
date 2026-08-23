package project14;
import java.util.*;
class design_bank{
	static String  bankname="Mariamman State Bank";
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    design_bank(int accountNumber,String accountType,double balance,String accountHolderName){
    	this.accountNumber=accountNumber;
    	this.accountType=accountType;
    	this.balance=balance;
    	this.accountHolderName=accountHolderName;
}
    void setter(String mobileNumber) {
    	this.mobileNumber=mobileNumber;
    }
    String getter() {
    	return mobileNumber;
    }
    void deposite(int amount) {
    	balance+=amount;
    	System.out.println("successfully deposited");
    }
    void withdraw(int amount) {
    	if(amount>=balance) {
    		System.out.println("insufficient amount");
    	}
    	else {
    		balance-=amount;
    		System.out.println("successfully deposited");
    		
    	}
    
    }
    void displayAccountDetails() {
    	System.out.println("accountnumber:"+accountNumber);
		System.out.println("Account HolderName:"+accountHolderName);
		System.out.println("Account Type:"+accountType);
		System.out.println("balance:"+balance);
	    System.out.println("mobilenumber:"+getter());
    }
}

public class design_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("no of accounts");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Accountnumber,Accountype,balance,AccountholderName");
			int number=sc.nextInt();
			sc.nextLine();
			String type=sc.nextLine();
			double balance=sc.nextDouble();
			sc.nextLine();
			String name=sc.nextLine();
			design_bank b=new design_bank(number,type,balance,name);
			System.out.println(" Enter mobile number from the user");
			String mobile=sc.nextLine();
			b.setter(mobile);
			System.out.println("Enter 1 for withdraw");
			System.out.println("Enter 2 for deposite");
			int a=sc.nextInt();
			if(a==1) {
				System.out.println("enter amount to withdraw");
				int amount=sc.nextInt();
				b.withdraw(amount);
			}
			else if(a==2) {
				System.out.println("Enter amount to deposite");
				int amount1=sc.nextInt();
				b.deposite(amount1);
			}
			else {
				System.out.println("choose correct option");
			}
			  
			b.displayAccountDetails();
			
		}

	}

}
