package project14;
class cons_bank{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    cons_bank(int accountNumber,String accountHolderName,String accountType,double balance){
    	this.accountNumber=accountNumber;
    	this.accountHolderName=accountHolderName;
    
    	this.accountType=accountType;
    	this.balance=balance;
    }
    void setMobileNumber(String mobileNumber) {
    	this.mobileNumber=mobileNumber;
    }
    void details() {
    	System.out.println("accountnumber:"+accountNumber);
		System.out.println("Account HolderName:"+accountHolderName);
		System.out.println("Account Type:"+accountType);
		System.out.println("Mobile Number:"+mobileNumber);
		System.out.println("balance:"+balance);
}
}
public class setter_cons_main {
	public static void main(String[] Args) {
		cons_bank s=new cons_bank(54,"rani","Savings",800000);
		s.setMobileNumber("9056324581");
		s.details();
	}
		
	}


