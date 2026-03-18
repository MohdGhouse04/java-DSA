public class firstAndlast {
    public static void main(String[] args) {
        
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    }
    
    
   static int search(int [] nums,int target,boolean findStartIndex){
        int ans=-1;
        int start =0;
        int end=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target < nums[mid]){
                start=mid+1;
            }else if(target>nums[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(findStartIndex  ){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
    }
    return ans;
}

