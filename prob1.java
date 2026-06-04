
import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q =sc.nextInt();
        for(int i=0;i<q;i++ ){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int dis1,dis2;
            if(x<z) dis1=x-z;
            else dis1=z-x;
            if(y<z) dis2=y-z;
            else dis2=z-y;
            if(dis1 == dis2) System.out.println("mouse");
            else if(dis1 < dis2) System.out.println("cat A");
            else System.out.println("cat B");

        }
    }
}
