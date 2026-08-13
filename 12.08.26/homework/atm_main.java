package java1;
class ATM{
	int atmid;
	String location;
	int cashAvailable=100000;
	int password=567432;
	ATM(int atmid,String location){
		this.atmid=atmid;
		this.location=location;
	}
	void insertCard() {
		System.out.println("successsfully card inserted");
	}
	void enterPin(int pass) {
		if(password==pass) {
			System.out.println("successfully login");
		}
		else {
			System.out.println("password is wrong");
		}
	}
	void withdrawCash(int amount) {
		if(amount<cashAvailable) {
			cashAvailable-=amount;
			System.out.println("successfully withdrawed");
			System.out.println("balance:"+(cashAvailable));
		}
		else {
			System.out.println("insufficient amount");
		}
	}
	void depositeCash(int amount) {
		cashAvailable+=amount;
		System.out.println("Successfully deposited");
		System.out.println("balance:"+(cashAvailable));
	}
	void checkBalance() {
		System.out.println("your account balance is:"+cashAvailable);
	}
	void exit() {
		System.out.println("thanyou!!!");
	}
}
class BankAccount extends ATM{
	int accountnumber;
	String holdername;
	int balance;
	BankAccount(int accountnumber,String holdername,int balance,int atmid,String location){
		super(atmid, location);
		this.accountnumber=accountnumber;
		this.holdername=holdername;
		this.balance=balance;
		
	}
	void withdraw(int amount) {
		balance-=amount;
		System.out.println("withdraw successfully using BankAccount");
		System.out.println("balance:"+(balance));
	}
	void Deposite(int amount) {
		balance+=amount;
		System.out.println("Deposite successfully using BankAccount");
		System.out.println(balance);
	}
	void checkBalance() {
		System.out.println("your current balance is:"+balance);
	}
	
}
class savingsAccount extends BankAccount{
	savingsAccount(int accountnumber, String holdername, int balance, int atmid, String location) {
		super(accountnumber, holdername, balance, atmid, location);
	}
	float interestRate=0.5f;
	void withdraw(int amount) {
		System.out.println("interest rate:"+(balance*interestRate));
	}

}
class currentAccount extends BankAccount{
	currentAccount(int accountnumber, String holdername, int balance, int atmid, String location) {
		super(accountnumber, holdername, balance, atmid, location);
	}
	float overdraftlimit=1000;
	void withdraw(int amount) {
		int b=balance-amount;
		if(b<overdraftlimit) {
			System.out.println("balance exceed overdraft");
		}
		else {
			System.out.println("successfully withdrawed your current balance:"+b);
		}
	}
}


public class atm_main {
public static void main(String[] args) {
	
	currentAccount c=new currentAccount(2405054,"madhavi",9000000,78,"dindigul");
	c.withdraw(8000);
	c.Deposite(67);
	c.withdraw(76);
	c.depositeCash(78);
	c.withdrawCash(290);
	c.checkBalance();
	savingsAccount s=new savingsAccount(2405055,"madhu",800000,79,"thiruvannamalai");
	s.withdraw(700000);
	s.checkBalance();
	
}
}
