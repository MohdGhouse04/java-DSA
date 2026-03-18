//package String;

import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        System.out.println(56); // internally it just printing string only
        Integer num=new Integer(56);//wrapper class
        System.out.println(num.toString());//it can done using by to string method 
        System.out.println("ghouse");//same thing happing 
        System.out.println(new int[]{1,2,3,4,5});//it will print random value bcz .value to .tostring will print 
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));//it will its own .tostring method to print

    }
}
