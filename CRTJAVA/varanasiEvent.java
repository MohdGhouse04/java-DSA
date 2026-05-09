// package java_CRT;

import java.util.Scanner;

public class varanasiEvent {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age >= 18 && age <=60){
        System.out.println("can enter for event");
    }
    else{
        System.out.println("not elegilble for event");
    }
  }  
}
