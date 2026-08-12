package project;

import java.util.*;
class second_java{
    public static void main(String args[]){
        int date;
        int m;
        int yr;
        Scanner sc=new Scanner(System.in);
        date=sc.nextInt();
        m=sc.nextInt();
        yr=sc.nextInt();
        if(yr>=1000 && yr<9999){
            if(m>=1 && m<=12){
                if((date>=1 && date<=31) && (m==1 ||m==3|| m==5||m==7||m==8||m==10||m==12)){
                        System.out.println("date is valid");
                }
                else if((date >=1 && date<=30 ) && (m==4||m==6||m==9||m==11)){
                    System.out.println("date is valid");
                }
                else if ((date >=1 && date<=28)&& (m==2)){
                    System.out.println("valid");
                }
                else if((date==29 && m==2) &&((yr%4==0 && yr%100!=0)||yr%400==0)){
                    System.out.println("valid");
                }
                else{
                    System.out.println("date is not valid");
                }
            }
            else{
                System.out.println("month is not valid");
            }
        }
        else{
            System.out.println("yr not valid");
        }
    }
}
