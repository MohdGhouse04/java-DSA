import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n =s.length();
        int count=0;
        for(int i=0;i<n-1;i++){
        char ch=s.charAt(i);
        char ch1=s.charAt(i+1);
        if(ch == ch1) count++;
        }
        System.out.println(count);
    }
}
