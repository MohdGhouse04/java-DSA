import java.util.Arrays;

public class max_in_array {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 25, 23, 4 },
                { 12, 23 },
                { 25, 24, 26, 27 },
                { 1, 2 }
        };
    
        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[][] arr) {
        int max =Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
