
import java.util.Scanner;

public class TVK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalseats = 234;
        int requriedtowin = totalseats/2+1;
        int seatsWehaving =sc.nextInt();
        int win =requriedtowin- seatsWehaving;
        if(seatsWehaving <= totalseats/2){
            System.out.println("some one have to join one party");
        }else{
    
        System.out.println("seats requried to win"+win);
    
    }
}
}
/*
int maj = n/2+1;
sout(k >= maj ? 0: maj-k) */
