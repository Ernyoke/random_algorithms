package algoexpoert;

public class SubarraySort {
    public static int[] subarraySort(int[] array) {
        int minValueNotSorted = Integer.MAX_VALUE;
        int maxValueNotSorted = Integer.MIN_VALUE;
        int firstNotSortedIndex = findFirstNotSortedIndex(array);
        if (firstNotSortedIndex == -1) {
            return new int[]{-1, -1};
        }
        int lastNotSortedIndex = findLastNotSortedIndex(array);
        if (lastNotSortedIndex == -1) {
            return new int[]{-1, -1};
        }
        for (int i = firstNotSortedIndex; i <= lastNotSortedIndex; i++) {
            minValueNotSorted = Math.min(minValueNotSorted, array[i]);
            maxValueNotSorted = Math.max(maxValueNotSorted, array[i]);
        }
        return new int[]{findPositionForValue(array, minValueNotSorted, 0, firstNotSortedIndex),
                findPositionForValue(array, maxValueNotSorted, lastNotSortedIndex, array.length) - 1};
    }

    private static int findFirstNotSortedIndex(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastNotSortedIndex(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    private static int findPositionForValue(int[] array, int value, int startPoz, int endPoz) {
        for (int i = startPoz; i < endPoz; i++) {
            if (value < array[i]) {
                return i;
            }
        }
        return endPoz;
    }
}

