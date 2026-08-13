package project12;
class BankAccount{
	void deposite(int amt) {
		System.out.println("deposited amt is:"+amt);
	}
	void deposite(int amt,String description) {
		System.out.println("deposite amt is:"+amt);
		System.out.println("description:"+description);
	}
	void deposite(int amt,String description,int id_no) {
		System.out.println("deposite amt is"+amt);
		System.out.println("descripion"+description);
		System.out.println("id no:"+id_no);
	}
}

public class account {
	public static void main(String [] args) {
		BankAccount b=new BankAccount();
		b.deposite(800000);
		b.deposite(40000,"thankyou");
		b.deposite(79990,"thankyou",9870);
	}

}
