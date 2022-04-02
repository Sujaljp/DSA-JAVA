package question.array;
//https://leetcode.com/problems/decompress-run-length-encoded-list/
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i+=2){
            int j = nums[i];
            while(j>0){
                list.add(nums[i+1]);
                j--;
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}