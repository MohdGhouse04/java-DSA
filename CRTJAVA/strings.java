
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // String s="programming";
        // System.out.println(s.toCharArray());
        // String s1="my life my code";
        // String s2[]=s1.split(" ");
        // for(String word : s2){
        //     System.out.println(word);
        // }
        String s=sc.nextLine();
        int count =0;
        int max=0;
        for(char c:s.toCharArray()){
            if("aeiou".indexOf(c) !=-1) {
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
        }
        

   
        System.out.println(max);



    }
}
