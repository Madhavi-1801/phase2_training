package project14;
class operation{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    operation(int accountNumber,String accountHolderName,String mobileNumber,String accountType,double balance){
    	this.accountNumber=accountNumber;
    	this.accountHolderName=accountHolderName;
    	this.mobileNumber=mobileNumber;
    	this.accountType=accountType;
    	this.balance=balance;
    }
    void setNumber(String mobileNumber) {
    	this.mobileNumber=mobileNumber;
    	
    }
    void getNumber() {
    	System.out.println("updated mobile number:"+mobileNumber);
    	
    }
    void details() {
    	System.out.println("accountnumber:"+accountNumber);
		System.out.println("Account HolderName:"+accountHolderName);
		System.out.println("mobile number:"+mobileNumber);
		System.out.println("Account Type:"+accountType);
		System.out.println("balance:"+balance);
	
    }
    void deposite(int amount) {
    	if(amount<=0) {
			System.out.println("Invalid deposite amount ");
			
		}
		else {
			balance+=amount;
			System.out.println("Successfully deposited");
			System.out.println("your current account balance:"+balance);
		}
    }
    void withdraw(int amount) {
    	if(amount<=0) {
			System.out.println("invalid withdrawal amount");
		}
		else if(amount>balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance-=amount;
			System.out.println("Successfully Withdrawed");
			System.out.println("your current balance:"+balance);
		}
    }
}


public class operation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation o=new operation(98,"mani","956727390","Savings",900000);
		o.details();
		o.deposite(5000);
		o.withdraw(3000);
		o.setNumber("99999999");
		o.getNumber();
		System.out.println(" ========================================================== ");
		operation o1=new operation(88,"manju","9552754521","current",80000);
		o1.details();
		o1.deposite(5000);
		o1.withdraw(3000);
		o1.setNumber("888888999");
		o1.getNumber();

	}

}
