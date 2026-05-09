public class workingProblems {
    static int fact(int x){
        if (x == 1 ) return 1;
        return x* fact(x-1);
    }
    static boolean StrongNumber(int n){
        int temp = n;
        int sum=0;
        while(temp >0){
            sum = sum + fact(temp %10);
            temp /= 10;

        }
        return sum == n;
    }
    static boolean isHappy(int x){
        while( x != 1 && x != 4){
            int sum =0;
            while(x >0){
                int rem = x % 10;
                sum +=rem * rem;
                x /=10;

            }
            x =sum;
        }
        return x ==1;
    }
    public static void main(String[] args) {
            //System.out.println(StrongNumber(145));
            int num =18;
            if(isHappy(num)) return ;
            //System.out.println(isHappy(18));
    }
}
-