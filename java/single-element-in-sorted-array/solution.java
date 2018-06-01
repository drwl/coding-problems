class Solution {
    public int singleNonDuplicate(int[] nums) {
        return singleNonDuplicate(nums, 0, nums.length - 1);
    }

    // Recursive approach
    public int singleNonDuplicate(int[] nums, int start, int end) {
        if (start == end) return nums[end];
        int mid = (end - start + 1) / 2 + start;
        int rightMid = mid;
        if (nums[mid] == nums[mid - 1]) rightMid--;
        if (nums[mid] == nums[mid + 1]) rightMid++;
        if (mid == rightMid) return nums[mid];

        // ensure rightMid is the right index, and mid is the left index
        if (mid > rightMid) { // rightMid should be greater than mid
            int tmp = mid;
            mid = rightMid;
            rightMid = tmp;
        }

        int left = mid - start;
        if ((left & 1) == 1) // odd, it contains
            return singleNonDuplicate(nums, start, mid - 1);
        else
            return singleNonDuplicate(nums, rightMid + 1, end);
    }
    // Time Complexity: O(log(N))
    // Space Complexity: O(log(N)). The stack will have log(N) calls.
}
