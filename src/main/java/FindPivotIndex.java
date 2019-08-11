// https://leetcode.com/problems/find-pivot-index

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        long[] runningSums = new long[nums.length + 1];
        long sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i - 1];
            runningSums[i] = sum;
        }
        sum += nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (runningSums[i] == sum - runningSums[i] - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
