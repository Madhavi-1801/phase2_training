package prooo;
abstract class Vehicle{
	int vehicleNumber;
	String brand;
	int baseRate;
	Vehicle(int vehicleNumber,String brand,int baseRate){
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.baseRate=baseRate;
		
	}
   abstract void calculateRendelCost(int days);
	void details() {
		System.out.println("vehicle number:"+vehicleNumber);
		System.out.println("brand:"+brand);
		System.out.println("baseRate"+baseRate);
	}
}
interface insurable{
	void getinsuranceCost();
}
class Car extends Vehicle implements insurable{
	Car(int vehicleNumber,String brand,int baseRate){
		super(vehicleNumber,brand,baseRate);
	}
	public void getinsuranceCost() {
		System.out.println("insurance for this vehicle is"+baseRate*0.25);
	}
	
	 void calculateRendelCost(int days) {
		System.out.println("rendelcost:"+baseRate/days);
		
	}
}
class Bike extends Vehicle{
	Bike(int vehicleNumber,String brand,int baseRate){
		super(vehicleNumber,brand,baseRate);
	}
	void calculateRendelCost(int days) {
		System.out.println("rendalcost"+(baseRate/days)*10);
		
		
	}
}
class truck extends Vehicle implements insurable {
	truck(int vehicleNumber,String brand,int baseRate){
		super(vehicleNumber,brand,baseRate);
	}
	public void getinsuranceCost() {
		System.out.println("insurance for this vehicle is"+baseRate*0.20);
	}
	void calculateRendelCost(int days) {
		System.out.println("rendalcost"+(baseRate/days)*20);
		
		
	}
}
public class rend {
public static void main(String [] Args) {
	Bike b=new Bike(9003,"kia",90000);
	truck t=new truck(3000000,"mahindra",800000);
	b.details();
	b.calculateRendelCost(70);
	t.details();
	t.calculateRendelCost(100);
	t.getinsuranceCost();
	insurable i = new truck(1001, "maruthi", 50000);
}
}
