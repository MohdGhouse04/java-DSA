
import java.util.Scanner;

// import org.xml.sax.SAXException;>util.*;
// package java_CRT;

public class evenOrodd {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num & 1 ) == ? "eevn" : "odd");
        // System.Out.println((num &1) ==0 ? "even" : "odd");
    }
}
