import java.util.Scanner;

public class Methods {
    static int addNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int sum = a + b;
        return sum;

    }

    static String greet() {

        String greeting = "how are you";
        return greeting;
    }

    public static void main(String[] args) {

        Methods obj = new Methods();
        obj.addNumbers();
        String message = greet();
    }
}
