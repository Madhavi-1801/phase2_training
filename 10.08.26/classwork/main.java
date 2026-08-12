package project;

import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        while(n>0){
            int c=n%10;
            if(c%2==0){
                even=(even*10)+c;
            }
            else{
                odd=(odd*10)+c;
            }
            n/=10;
        }
        System.out.println("odd"+odd);
        System.out.println("even"+even);
    }
}
