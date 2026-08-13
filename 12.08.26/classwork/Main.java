package project12;
class Shapes{
	void area() {
		System.out.println("area of shapes");
	}
	void area(int a) {
		System.out.println("square:"+a*a);
	}
	void area(int a, int b) {
		System.out.println("rec:"+2*a*b);
	}
	void area(float a,int b,int h) {
		System.out.println("triangle:"+a*b*h);
	}
	void area(double a,int b) {
		System.out.println("circle:"+a*b*b);
	}
}


public class Main {
	public static void main(String [] args) {
		Shapes s=new Shapes();
		s.area();
		s.area(6,9);
		s.area(8);
		s.area(0.5f,4,8);
		s.area(3.17,9);
		
	}

}
