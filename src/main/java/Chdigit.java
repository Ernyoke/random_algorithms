// https://www.codechef.com/MARCH19B/problems/CHDIGIT/

public class Chdigit {
    public int solve(int n, int d) {
        StringBuilder buffer = new StringBuilder().append(n);
        int initialLength = buffer.length();
        int min = d;
        for (int i = buffer.length() - 1; i >= 0; i--) {
            int x = Integer.valueOf(String.valueOf(buffer.charAt(i)));
            if (x <= min) {
                min = x;
            } else {
                buffer.delete(i, i + 1);
            }
        }
        for (int i = buffer.length(); i < initialLength; i++) {
            buffer.append(d);
        }
        return Integer.valueOf(buffer.toString());
    }
}
