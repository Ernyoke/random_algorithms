//https://leetcode.com/explore/interview/card/top-interview-questions-medium/113/math/815/

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 1) {
            return false;
        }
        int count = 8;
        while (count > 0) {
            n = sumSquare(n);
            if (n == 1) {
                return true;
            }
            count--;
        }
        return false;
    }

    private int sumSquare(int n) {
        int res = 0;
        while (n > 0) {
            res += (n % 10) * (n % 10);
            n = n / 10;
        }
        return res;
    }
}
