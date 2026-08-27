package prooo;
import java.util.*;
public class stack_mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100, 80, 60, 70, 60, 75, 85};
		int[] res=new int[arr.length];
		int n=arr.length;
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<n;i++) {
			while(!stack.isEmpty()&&arr[stack.peek()]<=arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				res[i]=i+1;
			}
			else {
				res[i]=i-stack.peek();
			}
			stack.push(i);
		}
		for(int i=0;i<n;i++) {
		System.out.println(res[i]);
		}
	}

}
