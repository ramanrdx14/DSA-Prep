package Arrays;

public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0]    = firstPos(nums,target);
        ans[1]    = lastPos(nums,target);
        return ans;
    }
    public int firstPos(int[] nums,int target){
        int start = 0;
        int end   = nums.length-1;
        int firstPos = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] >= target){
                if(nums[mid] == target){
                    firstPos = mid;
                }
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return firstPos;
    }
    public int lastPos(int[] nums,int target){
        int start = 0;
        int end   = nums.length-1;
        int lastPos = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] > target){
                end = mid - 1;
            }else{
                if(nums[mid] == target){
                    lastPos = mid;
                }
                start =  mid + 1;
            }
        }
        return lastPos;
    }
}
