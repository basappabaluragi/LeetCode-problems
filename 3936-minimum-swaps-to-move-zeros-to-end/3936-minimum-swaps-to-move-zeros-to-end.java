class Solution {
    public int minimumSwaps(int[] nums) {
        int zeroCount = 0;

        // Count total zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }

        int swaps = 0;
        int limit = nums.length - zeroCount;

        // Count misplaced zeros
        for (int i = 0; i < limit; i++) {
            if (nums[i] == 0) {
                swaps++;
            }
        }

        return swaps;
    }
}