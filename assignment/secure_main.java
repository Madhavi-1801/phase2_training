package project14;
class secure_bank{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    secure_bank(int accountNumber,String accountHolderName,String mobileNumber,String accountType,double balance){
    	this.accountNumber=accountNumber;
    	this.accountHolderName=accountHolderName;
    	this.mobileNumber=mobileNumber;
    	this.accountType=accountType;
    	this.balance=balance;
    }
    void details() {
    	System.out.println("accountnumber:"+accountNumber);
		System.out.println("Account HolderName:"+accountHolderName);
		System.out.println("mobile number:"+mobileNumber);
		System.out.println("Account Type:"+accountType);
		System.out.println("balance:"+balance);
	
    }
}

public class secure_main {
	public static void main(String[] Args) {
		secure_bank s=new secure_bank(56,"madhu","6724569201","Savings",8900);
		
		s.details();
	}

}
