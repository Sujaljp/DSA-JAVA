package question.other;

public class FindTheMissingElement {
    public static void main(String[] args) {
        // Your Code Here
        int n = 5;
        int ans = 0;
        int[] arr = {1,2,3,5};
        for(int i =1; i<=n;i++){
            boolean isThere = false;
            for(int j : arr){
                if(i==j){
                    isThere = true;
                    break;
                }
            }
            if (!isThere){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
