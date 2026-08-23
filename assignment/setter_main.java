package project14;
class setter_bank{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    setter_bank(int accountNumber,String accountHolderName,String accountType,double balance){
    	this.accountNumber=accountNumber;
    	this.accountHolderName=accountHolderName;
    
    	this.accountType=accountType;
    	this.balance=balance;
    }
    void setMobileNumber(String mobileNumber) {
    	this.mobileNumber=mobileNumber;
    }
    String getMobileNumber() {
    	return mobileNumber;
    }
    void details() {
    	System.out.println("accountnumber:"+accountNumber);
		System.out.println("Account HolderName:"+accountHolderName);
		System.out.println("Account Type:"+accountType);
		System.out.println("balance:"+balance);
    }
}

public class setter_main {
	public static void main(String[] Args) {
		setter_bank s=new setter_bank(54,"rani","Savings",800000);
		s.setMobileNumber("9056324581");
		s.details();
		System.out.println("updated mobile number:"+s.getMobileNumber());
		
	}

}
