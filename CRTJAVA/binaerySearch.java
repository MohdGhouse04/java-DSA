
import java.util.ArrayList;

public class binaerySearch {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(6);
        array.add(16);
        array.add(20);
        binaerySearch obj=new binaerySearch();
        System.out.println(obj.binarysearch(array, 16, 0, array.size()-1));

    }
    int binarysearch(ArrayList<Integer> array,int target,int start,int end){
        // int start =0;
        // int end=array.size()-1;
        if(start>end) return -1;
            int mid=start+(end-start)/2;
            if(array.get(mid)<target){
                return binarysearch(array, target, mid+1, end);
            } //start=mid+1;
            else if (array.get(mid) > target){
                return binarysearch(array, target, start, mid-1);
            }//end=mid-1;
            else return mid;
    }
}
