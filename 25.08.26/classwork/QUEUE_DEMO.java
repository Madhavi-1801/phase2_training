package practise;

import java.util.*;

public class QUEUE_DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String > q=new LinkedList<>();
		int num=10;
		q.offer("1");
		String cur="";
		for(int i=1;i<=num;i++) {
			 cur=q.poll();
				System.out.println(cur);
			
			q.offer(cur+"0");
			q.offer(cur+"1");
		
		}
		
		

	}

}