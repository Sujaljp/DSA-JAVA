package question.binarySearchQ;

public class SortedInfiniteArr {
    public static void main(String[] args) {
        // just a eg but in reallity the array is infinitely long
        int[] arr = {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,3,3};
        int target =1;
        int start = 0;
        int end = 2;
        //we are doubling the search area to include the target within it
        // so that once it is in our range array we can use binary search
        while(arr[end]<target){
            // trying to reduce the search area by taking start ahead to the previous end
            start = end + 1;
            //and squaring the value of end so that growth is exponential
            end = end*end;
        }
        while(start<=end){
            int mid = (start +end)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(arr[mid]<target){
                start= mid+1;
            }else{
                System.out.println(mid);
                break;
            }
        }
        System.out.println("done");
    }
}
