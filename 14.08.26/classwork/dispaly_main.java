package project14;
import java.util.*;


public class dispaly_main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Details");
		System.out.println("Bank Name");
		String bank=sc.nextLine();
		System.out.println("accountnumber:");
		int acc_num=sc.nextInt();
		System.out.println("Account HolderName:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Account Type:");
		String type=sc.nextLine();
		System.out.println("balance:");
		double balance=sc.nextDouble();
	    System.out.println("mobilenumber:");
	    sc.nextLine();
	    String num=sc.nextLine();
	    System.out.println("=============================================");
	    System.out.println(bank.toUpperCase());
	    System.out.println("=============================================");
	    System.out.println("AccountNumber:"+acc_num);
		  System.out.println("AccountHolderName:"+name);
		  System.out.println("MobileNumber:" +num);
		  System.out.println("AccountType:"+type);
		  System.out.println("Balance:"+balance);

	}

}
