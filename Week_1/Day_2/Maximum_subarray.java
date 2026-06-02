class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];   // start with first element
        int maxSum = nums[0];       // best sum so far

        for (int i = 1; i < nums.length; i++) {
            // either extend the current subarray or start fresh from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // update max if current is better
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
