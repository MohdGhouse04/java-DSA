public class search_in_range {
    public static void main(String[] args) {
        int[] nums = { 10, 2, 03, 50, 40, 60, 70, 80, 9, 2 };
        int target = 9;
        int ans = linearsearch(nums, target, 1, 6);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

}
