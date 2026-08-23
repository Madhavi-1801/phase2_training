package project13;
class insufficientException extends Exception{
	public insufficientException(String error) {
		super(error);
	}
}
class BankAccount {
	int balance;
	BankAccount (int balance){
		this.balance=balance;
	}
	

void withdraw(int amount) throws insufficientException {
	if(amount<balance) {
		System.out.println("successfuly withdrawed \n current amount:"+(balance-amount));
	}
	else {
		throw new insufficientException("insufficient amount");
	}
}
	}

public class Main {
	public static void main(String [] args) {
		BankAccount b=new BankAccount(9000);
		try {
		b.withdraw(20000);
		}
		catch (insufficientException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
