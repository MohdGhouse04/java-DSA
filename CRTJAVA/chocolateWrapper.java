import java.util.Scanner;

public class chocolateWrapper {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choc =sc.nextInt();
        int wrapes = sc.nextInt();
        System.out.println(totalDays(choc,wrapes));


    }
    static int totalDays(int c , int w){
        int days=c;
        w = w+c;
        while (w >= 7){
            int new_choc= w/7;
            days = days+new_choc;
            w = new_choc +(w%7);

        }
        return days;
    }
    
}

