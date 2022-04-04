04/04/2022
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
Question: Number of Steps to Reduce a Number to Zero
Approach: I was learning recursion and solved it that way
          basically created a function with args number and the counter
          1. Base condition n%10 == n => return the count
          2. if odd => fun(num-- and count++)
          3. if even => fun(num/2 and count++)
