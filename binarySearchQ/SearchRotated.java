package question.binarySearchQ;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchRotated {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        boolean left = false;
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        if(target>=nums[0]){
            left = true;
        }
        int pivot = pivot(nums);
        if(left){
            ans = binary(0,nums,pivot, target);
        }else{
            ans = binary(pivot+1,nums,nums.length-1, target);
        }
        System.out.println(ans);
    }
    static int pivot(int[] nums) {
        boolean left = false;
        int start = 0;
        int end = nums.length - 1;
        if(nums[start]<nums[end]){
            return end;
        }
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[start] < nums[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return start;
    }
    static int binary(int start, int[] nums, int end, int target){
        while(start<=end){
            int mid = (start+end)/2;
            if (nums[mid]<target){
                start = mid+1;
            } else if(nums[mid]>target){
                end = mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}