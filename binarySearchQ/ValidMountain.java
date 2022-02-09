package question.binarySearchQ;
//https://leetcode.com/problems/valid-mountain-array/
public class ValidMountain {
    class Solution {
        public boolean validMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            if(arr.length<3){
                return false;
            }
            for(int i = 0;i<arr.length-1;i++){
                if(arr[start]<arr[start+1]){
                    start++;
                }
            }
            if(start == arr.length-1){
                return false;
            }
            for(int j = arr.length-1;j>0;j--){
                if(arr[end]<arr[end-1]){
                    end--;
                }
            }
            if(end == 0){
                return false;
            }
            return start == end;

        }
    }
}
