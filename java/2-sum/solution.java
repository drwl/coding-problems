class Solution {
    // Time Efficient
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            if (dict.containsKey(newTarget)) {
                res[0] = i; res[1] = dict.get(newTarget);
                break;
            }
            dict.put(nums[i], i);
        }
        return res;
    }
    // Time Complexity: O(N), where N is number of ints
    // Space Complexity: O(N)

    // Space Efficient
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length && !found; i++) {
            int newTarget = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (newTarget == nums[j]) {
                    res[0] = i; res[1] = j;
                    found = true;
                    break;
                }
            }
        }
        return res;
    }
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
}
