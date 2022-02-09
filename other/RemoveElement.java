package question.other;
//https://leetcode.com/problems/remove-element/
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int ans = removeElement(nums, val);
        System.out.println(ans);
    }
    static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            boolean twoTimes = false;

            if(val == nums[i]){
                count++;
                for(int j=i; j<n-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[n-1]= Integer.MAX_VALUE;
                if(val == nums[i]){
                    twoTimes = true;
                }
            }
            if(twoTimes){
                twoTimes = false;
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return n-count;
    }

}

//Alternate solution but very nice one
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
