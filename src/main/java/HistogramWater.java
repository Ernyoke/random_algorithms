import java.util.Arrays;

public class HistogramWater {

    private static int maxPoz(int[] a, int start, int end) {
        int max = a[start];
        int maxP = start;
        for (int i = start + 1; i < end; i++) {
            if (a[i] > max) {
                max = a[i];
                maxP = i;
            }
        }
        return maxP;
    }

    public static int solve(int[] histogram) {
        int[] leftMax = new int[histogram.length];
        int[] rightMax = new int[histogram.length];
        int[] delta = new int[histogram.length];
        for (int i = 0; i < histogram.length; i++) {
            rightMax[i] = maxPoz(histogram, i, histogram.length);
            leftMax[i] = maxPoz(histogram, 0, i);
            int min = Math.min(histogram[leftMax[i]], histogram[rightMax[i]]);
            if (min - histogram[i] > 0) {
                delta[i] = min - histogram[i];
            }
        }
        return Arrays.stream(delta).sum();
    }
}
