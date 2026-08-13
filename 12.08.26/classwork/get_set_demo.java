package project12;
class person{
	private String name;
	private int  age;
	public void set_t(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String get_t() {
	 return name;
	}
	
	
}

public class get_set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.set_t("madhavi", 19);
		System.out.println(p.get_t());

	}

}
