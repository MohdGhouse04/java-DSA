import java.util.*;
public class arrayClass {
    public static void main(String[] args) {
        //int arr[] ={2,3,1,5,4};
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int arr[]=new int[10];
        Arrays.fill(arr, 7);
        int arr1[]={1,2,3,4};
        int arr2[]={1,2,34,4};
        //System.out.print(Arrays.equals(arr1, arr2));
        int arr3[]= {1,2,3,4};
        int arr4[]=Arrays.copyOf(arr3,10);
        //System.out.print(Arrays.toString(arr4));
        int arr5[]={1,2,3,4,5,6};
        System.out.println(Arrays.binarySearch(arr5, 5));

    }
}
