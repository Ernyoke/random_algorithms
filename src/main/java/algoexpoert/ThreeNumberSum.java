package algoexpoert;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeNumberSum {
    public static ArrayList<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        ArrayList<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int sum = array[i] + array[left] + array[right];
                if (sum == targetSum) {
                    result.add(new Integer[]{array[i], array[left], array[right]});
                }
                if (sum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
