import java.util.*;

public class array_passing_in_functions {
    public static void main(String[] args) {
        int[] nums = { 22, 33, 44 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
