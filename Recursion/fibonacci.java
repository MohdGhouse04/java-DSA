public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }

    static int fibo(int n){
        // //base condition
        // if (n<2) {
        //     return n;
        // }
        // return fibo(n-1)+fibo(n-2);
        return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
