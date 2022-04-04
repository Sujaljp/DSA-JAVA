04/04/2022 <br>
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/<br>
Question: Number of Steps to Reduce a Number to Zero<br>
Approach: I was learning recursion and solved it that way<br>
          basically created a function with args number and the counter<br>
          1. Base condition n%10 == n => return the count<br>
          2. if odd => fun(num-- and count++)<br>
          3. if even => fun(num/2 and count++)<br>
<br>
