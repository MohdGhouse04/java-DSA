public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = { -111, -2, -1, 0, 1, 12, 23, 25, 24, 26, 28, };
        int target = -2;
        int ans = OrderAgn_binary_search(arr, target);
        System.out.println(ans);
    }

    static int OrderAgn_binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAgn = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (isAgn) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    }

                }

            }

        }
        return -1;
    }
}
