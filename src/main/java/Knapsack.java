import org.jetbrains.annotations.Contract;

public class Knapsack {

    @Contract(pure = true)
    public static int solveMax(int weight[], int value[], int n, int kWeight) {
        int tempKnap[][] =  new int[n + 1][kWeight + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= kWeight; j++) {
                if (i == 0 || j == 0) {
                    tempKnap[i][j] = 0;
                } else {
                    if (weight[i - 1] <= j) {
                        tempKnap[i][j] = Math.max(value[i - 1] + tempKnap[i - 1][j - weight[i - 1]], tempKnap[i - 1][j]);
                    } else {
                        tempKnap[i][j] =  tempKnap[i-1][j];
                    }
                }
            }
        }
        print(tempKnap, n+1, kWeight+1);
        return tempKnap[n][kWeight];
    }

    public static void print(int tempKnap[][], int n, int m) {
        for  (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tempKnap[i][j] + " ");
            }
            System.out.println();
        }
    }
}
