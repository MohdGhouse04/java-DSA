
import java.util.Scanner;

public class longestincreassingSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int k =sc.nextInt();
        int arr[]= new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] =sc.nextInt();
        }
        int count =0,max=0;
        for (int i = 1; i < size; i++) {
            if(arr[i] > arr[i-1]){
                count++;
                max=Math.max(max,count);
            }
            else 
                count=0;
        }
        System.out.println(max);
    }
}
