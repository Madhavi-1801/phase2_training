package project13;


import java.util.*;

public class listdemo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List <Integer> list=new ArrayList<>();
		while(true){
			int a=sc.nextInt();
			if(a==-1) {
				break;
			}
			list.add(a);

		}
		
		int j=0;
		for( int i=0;i<list.size();i++) {
			if(list.get(i)%10!=0) {
				int temp=list.get(i);
				for(int c=i;c>j;c--) {
					list.set(c, list.get(c-1));
					
				}
				list.set(j, temp);
				j++;
			}
		
		}
		System.out.println(list);
		sc.close();

	}

}
