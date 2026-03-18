import java.util.Scanner;

public class type_casting_coversion {
    public static void main(String[] args) {
        // int a = 20;
        // float b = a;
        // System.out.println(b);
        // int c = (int) 23.56;
        // System.out.println(c);
        // byte d = 20;
        // byte e = (byte) (254681);// it will give reminder as ans by using modul
        // division

        // System.out.println(d * 35);
        // System.out.println(e);
        // int number = 'A';
        // System.out.println(number);
        int i = 10;
        float f = 25.5f;
        char c = 'A';
        long l = 258741369L;
        short s = 254;
        double d = 0.258741;
        boolean b = true;
        double result = (i * f) + (c / l) + (s * d);
        System.out.println((i * f) + "" + (c / l) + "" + (s * d));
        System.out.println(result);

    }
}
