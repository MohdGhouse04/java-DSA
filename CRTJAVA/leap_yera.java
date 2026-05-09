// package java_CRT;

import java.util.Scanner;

// import.java.*;
public class leap_yera {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int year = sc.nextInt();
    if(year % 400 == 0){
        System.out.println("centuray leap year");
    }
    else if(year % 100 == 0){
        System.out.println("not a centuray leap year");
    }
    else if (year % 4 == 0 ){
        System.out.println("leap year");

    }
    else{
        System.out.println("nota leap year");
    }
   } 
}
