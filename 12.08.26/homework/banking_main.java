package java1;
import java.util.*;
public class Bank1{
	int accountnumber;
	String holdername;
	int balance;
	Bank1(int accountnumber,String holdername,int balance){
		this.accountnumber=accountnumber;
		this.holdername=holdername;
		this.balance=balance;
	}
	void deposite(int amount) {
		balance+=amount;
		System.out.println("successfully deposite");
		System.out.println("your current balance"+balance);
	}
	void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("successfully credited");
			System.out.println("your current balance:"+balance);
		}
	}
	class SavingsAccount extends Bank1{
          int amount;
		SavingsAccount(int accountnumber, String holdername, int balance,int amount) {
			super(accountnumber, holdername, balance);
			
			
		}
		void withdraw(int amount) {
			int b=balance-amount;
			if(b<1000) {
				System.out.println("minimum balance of 1000 should be maintain");
			}
			else {
				System.out.println("withdrawed successfully");
				System.out.println("your current balance is:"+b);
			}
			
		}   
	
		
	}
	class currentAccount extends Bank1{
	
		currentAccount(int accountnumber,String holdername,int balance){
			super(accountnumber,holdername,balance);
					}
			void withdraw(int amount) {
				
				if(amount>5000) {
					System.out.println("ovedrift limit is 5000");
				}
				else {
					balance-=amount;
					System.out.println("withdrawed successfully");
					System.out.println("your current balance is:"+balance);
				}
				
			}
		}
	}

public class banking_main {
public static void main(String[] args) {
	currentAccount c=new currentAccount(54,"madhavi",500000);
	c.withdraw(90);
	
}
}
