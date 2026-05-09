import java.util.Scanner;
public class neonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end =sc.nextInt();
        for (int i = start; i < end; i++) {
            if(neoun(start))
                System.out.println(i);
        }
        
        }

    
    public static boolean neoun(int n ){
        int sqr = n*n;
        int sum =0;
        while (sqr > 0)
        {
            sum = sum+sqr%10;
            sqr = sqr / 10;
        }
        return sum == n;

    }
}
