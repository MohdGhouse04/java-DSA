//package String;

public class comparison {
    public static void main(String[] args) {
        String a= "ghouse";
        String b= "ghouse";
        System.out.println(a == b);//here we are using == method in side the string pool
        String a1= new String("ghouse");
        String b1= new String("ghouse");
        System.out.println(a1 == b1);//here we are using .equal method outside the string pool
        System.out.println(a1.equals(b1));//it will check the values of object is equal are not 
        System.out.println(a1.charAt(0));//it give one cha from string // strings are working arrays but the same 
        

    }
}

