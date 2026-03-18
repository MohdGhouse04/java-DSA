public class Conditions {
    public static void main(String[] args) {
        // int i=10;
        // if(i==10){
        //     System.out.println("hi");
        // }
        // else{
        //     System.out.println("bye");
        // }
        int salary =25000;
        if(salary > 20000){
            salary +=1000;
        }
        else if(salary >25000){
            salary +=2000;
        }
        else {
            salary+=5000;
        }
        System.out.println(salary);
    }
}
