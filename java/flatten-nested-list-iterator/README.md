## 341. Flatten Nested List Iterator (Leetcode, Medium)
### Source: [Leetcode](https://leetcode.com/problems/flatten-nested-list-iterator/description/)

Problem

```
Given a nested list of integers, implement an iterator to flatten it.

Each element is either an integer, or a list -- whose elements may also be
integers or other lists.

Example 1:
Given the list [[1,1],2,[1,1]],

By calling next repeatedly until hasNext returns false, the order of elements
returned by next should be: [1,1,2,1,1].

Example 2:
Given the list [1,[4,[6]]],

By calling next repeatedly until hasNext returns false, the order of elements
returned by next should be: [1,4,6].
```

<details>
<summary>Solution Notes</summary>
__Solution__  
I believe you could use recursion to solve this problem. I found it easier to
use a stack.

The trick is to use keep flattening NestedInteger objects that are lists and
keep only integers at the top of the stack.
</details>
