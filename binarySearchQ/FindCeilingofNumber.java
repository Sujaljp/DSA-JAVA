package question.binarySearchQ;

public class FindCeilingofNumber {
        public static void main(String[] args) {
            int[] arr = {1,2,5,6,7,8,9,21,84,111,214,354,455};
            int target = 455;
            System.out.println(orderAgnosticBS(arr,target));

        }
        static int orderAgnosticBS(int[] arr,int target){

            int start = 0;
            int end = arr.length-1;
            boolean isAsc = arr[start] < arr[end];
            if(target>arr[arr.length-1]){
                return -1;
            }
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]>target){
                    if(isAsc){
                        end=mid-1;
                    } else {
                        start = mid+1;
                    }

                }else if(arr[mid]<target){
                    if(isAsc){
                        start = mid+1;
                    } else {
                        end=mid-1;
                    }

                }else {
                    return mid;
                }
            }
            return start;
        }
    }