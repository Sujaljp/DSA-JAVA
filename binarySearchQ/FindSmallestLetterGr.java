package question.binarySearchQ;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetterGr {
    //note there was a condition ["e","e","e","e","e","e","n","n","n","n"]
    // here we found e already but still do start=mid+1
    //"e","n","n","n","n" checking is done here
    // normal execution ahead
    // stat & mid ->"e","n" <-end
    // end->"e","n" <-stat while loop breaks
    public char nextGreatestLetter(char[] letters, char target) {
        int ans = binary(letters, target);
        return letters[ans];
    }
    int binary(char[] l, char target){
        int start = 0;
        int end = l.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(l[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start%l.length;
    }
}
