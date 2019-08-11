//https://leetcode.com/problems/maximum-subarray/

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        if (nums == null || nums.length == 0) {
            return sum;
        }
        sum = nums[0];
        int max = sum;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);

        }
        return max;
    }
}
