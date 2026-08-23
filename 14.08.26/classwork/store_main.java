package project14;
abstract class store{
	private String product_name;
	private int product_id;
	private double price;
	store(String product_name,int product_id,double price){
		this.product_name=product_name;
		this.product_id=product_id;
		this.price=price;
		
	}
	double getter() {
		return price;
		
	}
	void check()throws Exception {
		if(price<=0) {
			throw new Exception("Invalid Amount");
		}
	}
	abstract void calculateDiscount(double price);
	void display() {
		System.out.println("Hi! this is from Mariamman Store");
		System.out.println("product name:"+product_name);
		System.out.println("Product id:"+product_id);
		System.out.println("Original Price:"+price);
	}
}
class Electronics extends store{
	Electronics(String product_name,int product_id,double price){
		super(product_name,product_id,price);
	}
	void calculateDiscount() {
		double final_price=getter()*0.10;
		System.out.println("Discount:0.10%");
		System.out.println("Final price:"+(getter()-final_price));
	}
}
class Clothing extends store{
	Clothing(String product_name,int product_id,double price){
		super(product_name,product_id,price);
	}
	void calculateDiscount() {
		double final_price=getter()*0.20;
		System.out.println("Discount:0.10%");
		System.out.println("Final price:"+(getter()-final_price));
	}
	
}
class Grocery extends store{
	Grocery(String product_name,int product_id,double price){
		super(product_name,product_id,price);
	}
	void calculateDiscount() {
		double final_price=getter()*0.30;
		System.out.println("Discount:0.10%");
		System.out.println("Final price:"+(getter()-final_price));
	}
}

public class store_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grocery g=new Grocery ("tomato",90,0);
		try {
		g.check();
		g.display();
		g.calculateDiscount();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Process done");
		}
	

	}

}
