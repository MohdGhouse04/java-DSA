//package patterns;

public class pattern {
  public static void main(String[] args) {
    //pattern1(4);
    //pattern2(4);
    //pattern3(4);
    //pattern4(4);
    //pattern5(5);
    //pattern28(5);
    //pattern30(5);
    //pattern17(5);
    pattern31(4);

  }  
  static void pattern1(int n){
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <=n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  static void pattern2(int n){
    for (int row = 0; row < n; row++) { // step1 check the no of lines means rows in pattern
        for (int col = 0; col <= row; col++) { // step2 check how many cols is there in every row 
            System.out.print("* ");// step3 check which pattern is there 
        }
        System.out.println();// for new line 
    }
  }
  static void pattern3(int n){
    for (int i = 0; i <=n; i++) {
      for (int j = 0; j<=n-i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
 
  }
  static void pattern4(int n){
    for (int row = 0; row < n; row++) { 
        for (int col = 0; col <= row; col++) { 
            System.out.print(col);
        }
        System.out.println();
    }
  }
  static void pattern5(int n){
    for (int row = 0; row < 2*n; row++) { 
      int totalcolinrow= row > n ? 2*n -row: row; /*if row > n  
                                                    col= n-(row -n)
                                                    col=2n-row
                                                    else row = col*/
        for (int col = 0; col < totalcolinrow; col++) { 
            System.out.print("* ");
        }
        System.out.println();
    }
  }
  static void pattern28(int n){
    for (int row = 0; row < 2*n; row++) { 
      //int totalcolinrow = row > n  ? 2*n -row : row;  
      int totalcolinrow=0;
      if (row > n) {
        totalcolinrow=2*n-row;
      }else totalcolinrow=row;
      int totalspaces= n -totalcolinrow;
      for (int s = 0; s < totalspaces; s++) {
        System.out.print(" ");
      }
      for (int col = 0; col < totalcolinrow; col++) { 
            System.out.print(" *");
        }
        System.out.println();
    }
  }
  static void pattern30(int n){
    for (int row = 1; row <= n; row++) { 
      for (int totalspaces = 0; totalspaces < n- row; totalspaces++) {
        System.out.print("  ");
      }
        for (int col = row; col >= 1; col--) { 
            System.out.print(col+ " ");
        }
        for (int col = 2; col <= row; col++) {
          System.out.print(col+ " ");
        }
    System.out.println();
    }

  } 
  static void pattern17(int n){
    for (int row = 1; row <= 2*n; row++) { 
      int c=row > n  ? 2*n -row : row;
      for (int totalspaces = 0; totalspaces < n- c; totalspaces++) {
        System.out.print("  ");
      }
        for (int col = c; col >= 1; col--) { 
            System.out.print(col+ " ");
        }
        for (int col = 2; col <= c; col++) {
          System.out.print(col+ " ");
        }
    System.out.println();
    }

  }
  static void pattern31(int n){
    int originalN =n;
    n= 2*n;
    for (int row = 0; row <= n; row++) { 
        for (int col = 0; col <= n; col++) { 
          int ateveryindex = originalN - Math.min(Math.min(row, col),Math.min(n-row,n- col));
            System.out.print(ateveryindex +" ");
        }
        System.out.println();
    }
  }

  
}
