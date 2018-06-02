## 540. Single Element in a Sorted Array (Leetcode, Medium)
### Source: [Leetcode](https://leetcode.com/problems/single-element-in-a-sorted-array/description/)

Problem

```
Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.

Example 1:
Input: [1,1,2,3,3,4,4,8,8]  
Output: 2  

Example 2:
Input: [3,3,7,7,10,11,11]
Output: 10  

Note: Your solution should run in O(log n) time and O(1) space.
```

<details>
<summary>Solution Notes</summary>
There are some really neat iterative solutions in the Leetcode discussions. A
big hint in running in O(log(N)) time is to use binary search. My approach is to
find the subarray containing the element that only appears once, and continuing
to search smaller subsections.

The general idea is: get the middle element, if it has a duplicate then it will
partition the array into two subarrays of unequal length. The subarray with an
odd length contains the single element.
</details>
