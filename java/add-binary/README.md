## 67. Add Binary (Leetcode, Easy)
### Source: [Leetcode](https://leetcode.com/problems/add-binary/description/)

Problem

```
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
```

<details>
<summary>Solution Notes</summary>
__Approach__
It's a lot like adding two numbers represented as linked lists. Have a pointer
pointing to the end of both lists. Take sum, keep track of a remainder, and
continue to move the pointer until both are not pointing to values. Strings are
immutable in Java so explicitly use StringBuilder to avoid unnecessary string
creation. More information: https://stackoverflow.com/q/12883730.
</details>
