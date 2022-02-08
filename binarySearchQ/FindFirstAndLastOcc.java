package question.binarySearchQ;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastOcc {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0]= bs(nums,target,true);
        ans[1]= bs(nums,target,false);
        return ans;
    }
    private int bs(int[] nums, int target, boolean left){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>target){
                end = mid-1;
            } else if(nums[mid]<target){
                start = mid+1;
            } else{
                ans = mid;
                if(left){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}