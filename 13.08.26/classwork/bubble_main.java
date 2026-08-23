package project13;
import java.util.*;

public class bubble_main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List <Integer> arr=new ArrayList<>(); 
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		boolean flag=true;
		for(int process=0;process<arr.size()-1;process++) {
		
			for(int i=0;i<arr.size()-1-process;i++) {
				if(arr.get(i)>arr.get(i+1)) {
					int temp=arr.get(i);
					arr.set(i,arr.get(i+1) );
					arr.set(i+1,temp);
					flag=false;
				}
				
			}
			if(flag) {
				break;
			}
		}
		System.out.println(arr);
		sc.close();
		
	}
	

}

