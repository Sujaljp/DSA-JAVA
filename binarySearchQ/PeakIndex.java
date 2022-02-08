package question.binarySearchQ;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndex {
        public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length;
            int ans = -1;
            while(start<=end){
                int mid = (start+end)/2;
                if(arr[mid]<arr[mid+1]){
                    //you are in ascending part
                    start = mid+1;
                } else{
                    if( arr[mid-1]>arr[mid]){
                        //you are in descending part
                        end = mid-1;
                    }else{
                        return mid;
                    }
                }
            }
            return ans;
        }
}
