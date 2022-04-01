//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = 0;
            for(int n: candies){
                if(max<n){
                    max=n;
                }
            }
            List<Boolean> l1 = new ArrayList<Boolean>();
            for(int n: candies){
                l1.add(max<=n+extraCandies);
            }
            return l1;
        }
}
