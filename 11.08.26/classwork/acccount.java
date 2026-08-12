package test;

public class acccount implements bank {
	public void deposite(int amount,int balance) {
		System.out.println("the amount "+amount+"is successfully deposit");
		System.out.println("the balance amount is:"+ balance+amount);
		
	}
	public void withdraw(int amount,int balance) {
		if(amount>balance) {
			System.out.println("insufficient bank balance");
		}
		else {
		System.out.println("the amount"+amount+" is successfully withdrawed");
		int res=balance-amount;
		System.out.println("the balance amount is:"+ res);
	}

}
}
