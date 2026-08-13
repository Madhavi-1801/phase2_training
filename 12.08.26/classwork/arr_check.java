package project12;
import java.util.*;
class arr{
	int[] a;
	arr(int[] a){
		this.a=a;		
	}
	void check()throws Exception {
	for(int i=0;i<a.length;i++) {
		if(a[i]<0) {
			throw new RuntimeException();
		}
		else if(a[i]<100&&a[i]>0) {
			throw new Exception();
			
		}
	}
	}
}

public class arr_check {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int []list=new int[n];
		for(int i=0;i<n;i++) {
			list[i]=sc.nextInt();
		}
		arr b=new arr(list);
		try {
		b.check();
		}
		catch (RuntimeException e) {
			System.out.println("value should be positive");
		}
		catch(Exception e) {
			System.out.println("value should be greater than 100");
		}
		

	}

}
