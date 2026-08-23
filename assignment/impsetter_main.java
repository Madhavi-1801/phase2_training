package project14;
import java.util.*;
class impsetter_bank{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    impsetter_bank(int accountNumber,String accountType,double balance){
    	this.accountNumber=accountNumber;
    	this.accountType=accountType;
    	this.balance=balance;
}
    void setvalues(String accountHolderName,String mobileNumber) {
    	this.accountHolderName=accountHolderName;
    	this.mobileNumber=mobileNumber;
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
    void deposite(int amount) {
    	balance+=amount;
    	System.out.println("Successfully credited");
    }
   void getvalues() {
	    System.out.println("accountnumber:"+accountNumber);
		System.out.println("Account HolderName:"+accountHolderName);
		System.out.println("Account Type:"+accountType);
		System.out.println("balance:"+balance);
	    System.out.println("mobilenumber:"+mobileNumber);
  }
}
public class impsetter_main {
	public static void main(String[] Args) {
		impsetter_bank i=new impsetter_bank(54,"Savings",9000);
		i.setvalues("arjun","9967342656");
		i.deposite(1000);
		i.withdraw(500);
		i.getvalues();
		
	}
}

