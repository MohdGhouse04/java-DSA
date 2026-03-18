public class array1 {
    public static void main(String[] args) {
        int[] ros;//decleration
        ros = new int[5];//intlization
        ros[0]=23;
        ros[2]=23;
        ros[3]=23;
        ros[4]=23;//inserting 
        System.out.println(ros[1]);
        //arays in java may not continous due to storing in heap =>uses the refference variable depemds on JVM
        int [] ros1 ={5, 35, 45, 55 ,65};
        System.out.println(ros1[2]);
        // String [] name ={};
        // System.out.println(name[0]);
     }
}
