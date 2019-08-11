package microsoft;

public class Task3 {
    public int solution(int[] A) {
        if (A == null || A.length <= 0) {
            return 0;
        }
        long runningSum = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            runningSum += A[i];
            if (runningSum == gaussSum(i + 1)) {
                count++;
            }
        }
        return count;
    }

    private long gaussSum(int n) {
        return n * (n + 1) / 2;
    }
}
