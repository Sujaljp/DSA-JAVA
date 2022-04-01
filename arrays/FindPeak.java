package question.array;
//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str : sentences){
            int count = 1;
 
            for (int i = 0; i < str.length() - 1; i++)
            {
                if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
                {
                    count++;
                }
            }
            System.out.println("Number of words in a string : " + count);
            if(max<count){
                max = count;
            }
        }
        return max;
    }
}
