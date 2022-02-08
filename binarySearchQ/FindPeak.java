package question.binarySearchQ;
//https://leetcode.com/problems/find-peak-element/
public class FindPeak {
        public int findPeakElement(int[] nums) {
            int s = 0;
            int e = nums.length-1;
            //if there is only one element array
            if(nums.length == 1){
                return 0;
            }
            while(s<e){
                int mid = (s+e)/2;
                if(nums[mid]>nums[mid+1]){
                    // as we don't know the element before mid is big or small
                    // so we just can go for mid
                    e = mid;
                }else{
                    // as we know the element after mid is already big
                    // so we just can go for mid+1
                    s = mid+1;
                }
            }
            // the loop will break on this condition where it is peak
            return s;
        }
}
