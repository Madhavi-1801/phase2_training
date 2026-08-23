package project14;
import java.util.*;
class bank1{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    bank1(int accountNumber,String accountHolderName,String mobileNumber,String accountType,double balance){
    	this.accountNumber=accountNumber;
    	this.accountHolderName=accountHolderName;
    	this.mobileNumber=mobileNumber;
    	this.accountType=accountType;
    	this.balance=balance;
    }
     int getAccountNumber() {
    	return accountNumber;
    	 
     }
     String getAccountHolderName() {
    	 return accountHolderName;
     }
     String getMobileNumber() {
    	 return mobileNumber;
     }
     String getAccountType() {
    	 return accountType;
     }
     double getBalance() {
    	 return balance;
     }
}

public class getter_main {
	public static void main(String[] Args) {
		bank1 account =new bank1(54,"madhu","5632785128","Current",90000);
		  System.out.println(account.getAccountNumber());
		  System.out.println(account.getAccountHolderName());
		  System.out.println(account. getMobileNumber());
		  System.out.println(account.getAccountType());
		  System.out.println(account.getBalance());
		
	}

}
