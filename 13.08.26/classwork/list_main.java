package project13;

import java.util.*;

public class list_main {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(54);
		list.add("madhavi");
		list.add("sri ramakrishna");
		list.add(8.71f);
		list.remove("sri ramakrishna");
		list.add(1,"student");
		if(list.contains("madhavi")){
			System.out.println("yes this is madhavi");
		}
		System.out.println(list.getFirst());
		System.out.println(list.toString());
		System.out.println(list);
		
	}

}
