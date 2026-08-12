package prooo;
import java.util.Scanner;
class Student1 {
	   int id;
	   String name;
	   int[]mark;
	   Student1(int id,String name,int [] mark){
		   this.id=id;
		   this.name=name;
		   this.mark=mark;
		   
	   }
	   int sum=0;
	   int avg=0;
	   void marks() {
		  
		   for(int i=0;i<mark.length;i++) {
			   sum+=mark[i]; 
		   }
		   avg=sum/5;
		   System.out.println("name:"+name);
		   System.out.println("id:"+id);
		   System.out.println("sum:"+sum);
		   System.out.println("avg:"+avg);
		   
	   }
	  
	   
	}
		

public class stu {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<2;j++) {
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int [] mark=new int[5];
		for(int i=0;i<5;i++) {
			mark[i]=sc.nextInt();
		}
		Student1 s1=new Student1(id,name,mark);
		s1.marks();
	}
	}

}


