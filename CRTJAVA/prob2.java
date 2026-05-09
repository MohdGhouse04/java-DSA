

public class prob2 {
    public static void main(String[] args) {
        student s = new student(100,100,100,100,100);
        s.result();
    
    }
    // public static int student(){
    //     Scanner sc = new Scanner(System.in);
    //     int subject1 =sc.nextInt();
    //     int subject2= sc.nextInt();
    //     int subject3 =sc.nextInt();
    //     int subject4= sc.nextInt();
    //     int subject5 =sc.nextInt();
    //     int total= subject1+subject2+subject3+subject4+subject5;
    //     int percentage =(total / 500)*100;
    //     return percentage;

    // }
    
    }
class student {
    int sub1, sub2,sub3,sub4,sub5;
    int total;
    double percentage;
    student(int ... numbers){
        for(int n : numbers){
            total += n;
        }
    }
    void result(){
        System.out.println(total);
        percentage=(total / 500)*100;
        System.out.println(percentage);
    }


}

