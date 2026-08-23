package project14;

import java.util.*;

public class req_main {
	public static void main(String[] Args) {
		Scanner sc=new Scanner(System.in);
		final String bank="MARIAMMAN STATE BANK";
		System.out.println("Enter Details");
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
