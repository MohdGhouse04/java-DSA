
import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tree=1;
        int h=sc.nextInt();
        for(int i=1;i<h;i++){
            if(i%2==1){
                tree=tree*2;
            }else{
                tree++;
            }
        }
        System.out.println(tree);
    }
}
