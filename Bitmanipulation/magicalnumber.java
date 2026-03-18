// package Bitmanipulation;
import java.util.*;
public class magicalnumber {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int n= number.nextInt();
        int ans =0;
        int base=5;
        while(n>0){
            int last=n&1;
            n = n>>1;//right shift
            ans += last*base;//ans = ans + (last * base);
            base=base*5;
        }
        System.out.println(ans);

    }
}
