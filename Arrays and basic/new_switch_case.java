import java.util.*;

public class new_switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr a fruit name:");
        String fruit = in.next();
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("keeps doctor away");
            case "grappe" -> System.out.println("smallest fruits");
            case "orange" -> System.out.println("grate in fibers");
            default -> System.out.println("plz enter a fruit name");
        }
    }
}
