import java.util.Scanner;

public class chefVaccination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int p =sc.nextInt();
        int x=sc.nextInt();
        int y =sc.nextInt();
        int [] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        System.out.println(timetaken(nums,p,x,y));
    }
    static int timetaken(int [] nums,int p,int x,int y) {
        int totaltime =0;
        for(int i =0;i<p;i++){
            if(nums[i] == 0)
                totaltime+=x; 
            else
                totaltime+=y;
            
        }
        return totaltime;
    }

}
