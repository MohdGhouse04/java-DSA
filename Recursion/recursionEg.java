public class recursionEg {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n == 5 ){ //base condition 
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);//tail recursion 
    }
}
