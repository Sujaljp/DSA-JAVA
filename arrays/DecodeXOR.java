//https://leetcode.com/problems/decode-xored-array

class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length+1];
        decoded[0] = first;
        int i = 0;
        for(int n: encoded){
            decoded[i+1] = Math.abs(n^decoded[i]);
            i++;
        }
        return decoded;
    }
}