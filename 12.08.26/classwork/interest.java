package project12;
class bank{
	int balance;
	bank(int balance){
		this.balance=balance;
		
	}
	void deposite(int amt) {
		
		System.out.println("successfully deposited");
		System.out.println("the amount in your account is:"+balance+amt);
		
	}
	void deposite(int amt,String des) {
	
		System.out.println("successfully deposited");
		System.out.println("the amount in your account is:"+balance+amt);
		System.out.println("description:"+des);
	}
}
class savings extends bank{
	savings(int balance){
		super(balance);
	}
	void interest(int amt) {
		System.out.println("interest of your asmt is:"+amt*0.10);
	}
}
class personal extends bank{
	personal(int balance){
		super(balance);
	}
	void interest(int amt) {
		System.out.println("interest of your amt is:"+amt*0.5);
	}
}
public class interest {
	public static void main(String[] args) {
		personal p=new personal(9000);
		p.interest(90000);
		p.deposite(9032);
		p.deposite(9023,"for health");
	}

}
