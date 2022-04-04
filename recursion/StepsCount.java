//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
class StepsCount {
    public int numberOfSteps(int num) {
        return steps(num, 0);
        
    }
    int steps(int num, int count){
        if(num%2==1){
            num--;
            return steps(num,count+1);
        }
        if(num==0){
            return count;
        }
        return steps(num/2,count+1);
    }
}