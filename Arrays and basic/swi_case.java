import java.util.*;

public class swi_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr a fruit name:");
        String fruit = in.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("keeps doctor away");
                break;
            case "grappe":
                System.out.println("smallest fruits");
                break;
            case "orange":
                System.out.println("grate in fibers");
                break;
            default:
                System.out.println("plz enter a fruit name");
        }
    }
}
