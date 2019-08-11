public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid;

        // if low < mid, then we know that left part of mid is sorted
        // otherwise right part is sorted
        // in each of two cases, we check if target in those sorted parts
        // if so, we search there, otherwise we search the other side
        // if low is equal to mid, go to the right part of the array to search

        while (true) {
            if (low > high) {
                return - 1;
            }
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] < nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[low] > nums[mid]){
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else if (nums[low] == nums[mid]) {
                low = mid + 1;
            }
        }
    }
}
