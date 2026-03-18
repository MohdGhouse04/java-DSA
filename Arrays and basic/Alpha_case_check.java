import java.util.Scanner;
public class Alpha_case_check {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        char ch =in.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lowe case letter");
        }
        else{
            System.out.println("upper case letter");
        }
        System.out.println(ch);
    }
}
