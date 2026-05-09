public class pattern {
    public static void main(String[] args) {
        int n=9;
        // for(int i =1;i<=n;i++){
        //     for(int j =1;j<=n;j++){
        //         if(i==j || i+j == n-1){
        //             System.out.println("*");
        //         }
        //         else
        //         {
        //             System.out.println(" ");
        //         }
        //     }
        // }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
        if (i == j || i + j == n - 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
int center =n/ 2;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (i == j || i + j == n - 1) {
            System.out.print(Math.abs(i - center));
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
    }
}
