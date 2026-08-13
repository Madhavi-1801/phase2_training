package project12;
import java.util.*;

public class Exception_demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 System.out.println("enter devident ans divisor:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.nextLine();
		
		String s=null;
		System.out.println("enter a index to access a character in string:");
		int c=sc.nextInt();
		System.out.println("enter size of array:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter a index value to access array element:");
		int d=sc.nextInt();
		try {
			System.out.println("result of division:"+ a/b);
			System.out.println("the character in index"+c+"is"+s.charAt(c));
			System.out.println("the element present the intex"+d+"is"+arr[d]);
			
		}
		catch(ArithmeticException e) {
			System.out.println(" numbers cannot devisible by 0");
		}
		catch(NullPointerException e) {
			System.out.println("string cannot null");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("index is invalid");
			
		}
		
		
		
	}

}
