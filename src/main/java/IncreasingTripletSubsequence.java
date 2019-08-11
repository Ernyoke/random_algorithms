public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] < first) {
               first = nums[i];
           }
           if (nums[i] > first && nums[i] < second) {
               second = nums[i];
           }
           if (nums[i] > second) {
               return true;
           }
        }
        return false;
    }
}
