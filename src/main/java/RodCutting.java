import org.jetbrains.annotations.Contract;

public class RodCutting {

    @Contract(pure = true)
    public static int solve(int price[], int length) {
        int sellValue[] = new int[length + 1];
        for (int i = 0; i < price.length && i <= length; i++) {
            sellValue[i] = price[i];
        }
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (sellValue[i] < sellValue[i - j] + sellValue[j]) {
                    sellValue[i] = sellValue[i - j] + sellValue[j];
                }
            }
        }
        return sellValue[length];
    }
}
