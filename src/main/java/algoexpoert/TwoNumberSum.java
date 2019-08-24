package algoexpoert;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> hashTable = new HashSet<>();
        for (int i : array) {
            hashTable.add(i);
        }
        for (int i : array) {
            int valueToFind = targetSum - i;
            if (valueToFind != i && hashTable.contains(valueToFind)) {
                if (i > valueToFind) {
                    return new int[]{valueToFind, i};
                } else {
                    return new int[]{i, valueToFind};
                }
            }
        }
        return new int[]{};
    }
}
