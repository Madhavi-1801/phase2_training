package project14;
import java.util.*;
class customer{
	String name;
	int cash;
	float discount;
	customer(String name,int cash,float discount){
		this.name=name;
		this.cash=cash;
		this.discount=discount;
		
	}
	void details() {
		System.out.println("Custmer Name:"+name);
		System.out.println("total amount of your products before discount:"+cash);
		System.out.println("discount percent:"+discount+"%");
		float amount=cash*discount;
		float finala=cash-amount;
		System.out.println("total amount of your products after discount:"+finala);
	}
}

public class iterator_demo {
	public static void main(String[] Args) {
		
		customer c1= new customer ("anand",2000,0.25f);
		customer c2= new customer ("anjali",5000,0.5f);
		List <customer>list=new LinkedList<>();
		list.add(c1);
		list.add(c2);
		ListIterator <customer> itr= list.listIterator();
		while(itr.hasNext()) {
			itr.next().details();
		}
		
	}

}
