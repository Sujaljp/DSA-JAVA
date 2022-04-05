#https://leetcode.com/problems/sort-even-and-odd-indices-independently/
class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        if len(nums)<3:
            return nums
        even = []
        odd = []
        for i in range(len(nums)):
            if i%2==0:
                even.append(nums[i])
            else:
                odd.append(nums[i])
        even.sort()
        odd.sort(reverse=True)
        ans = []
        j = 0
        for i in even:
            ans.append(i)
            if len(odd)>j:  
                ans.append(odd[j])
            j+=1
        return ans