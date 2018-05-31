## Two Sum (Leetcode, Easy)
### Source: [Leetcode](https://leetcode.com/problems/two-sum/description/)

Problem

```
Given an array of integers, return indices of the two numbers such that they add
 up to a specific target.

You may assume that each input would have exactly one solution, and you may not
use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

<details>
<summary>Solution Notes</summary>
__Bruteforce (also Space Efficient)__  
Iterate through array. For each integer, find the new target and search the rest
 of the sub-array for it.

__Time Efficient__  
You can find the result in one pass by using a map with key being the integer
value, and the value being the index. As you iterate through the array, check to
 see if the new target exists, and if so return.
</details>
