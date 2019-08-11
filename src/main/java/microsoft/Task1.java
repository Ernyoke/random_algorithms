package microsoft;

public class Task1 {
    public int solution(int[] A) {
        int length = 0;
        if (A == null || A.length <= 0) {
            return length;
        }
        int head = A[0];
        length++;
        while (head > 0) {
            head = A[head];
            length++;
        }
        return length;
    }
}
