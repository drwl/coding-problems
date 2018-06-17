## 74. Two Sum (Leetcode, Medium)
### Source: [Leetcode](https://leetcode.com/problems/search-a-2d-matrix/description/)

Problem

```
Write an efficient algorithm that searches for a value in an m x n matrix. This
matrix has the following properties:  

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous
row.

Example 1:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true

Example 2:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false
```

<details>
<summary>Solution Notes</summary>
Since the matrix is sorted, you can treat it as if it was using binary search on
a long list.

Continually divide the matrix and search until you find the column the target
should be in. Then binary search the column.
</details>
