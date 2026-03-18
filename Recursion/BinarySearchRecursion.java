public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={23,35,67,88};
        int target=67;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[] arr,int target,int s,int end){
        if(s>end){
            return -1;
        }
        int m= s+(end-s)/2;
        if(arr[m] == target) return m;
        if(target < arr[m]) return search(arr, target, s, m-1);
        else return search(arr, target, m+1, end);
    }
}
