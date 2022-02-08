package question.other;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class DigitsWithEvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {555,901,4825,1771};
        int count = 0;
        for (int i: arr) {
            if (noDigits1(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean noDigits(int n){
        int count = 0;
        while(n>0) {
            count++;
            n = n / 10;
        }
        return count%2==0;
    }
    // using the log we can speed up the algorithm
    // log10(1000) = 3 basically 10 multiplied three times
    // 3+1 will be the number of digits
    static boolean noDigits1(int n){
        int count = (int) Math.log10(n)+1;
        return count%2==0;
    }
}
