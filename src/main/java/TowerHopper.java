import org.jetbrains.annotations.Contract;

public class TowerHopper {
    @Contract(pure = true)
    public static boolean solve(int towers[]) {
        boolean canReachEnd[] = new boolean[towers.length];
        for (int i = towers.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < towers.length && j <= i + towers[i]; j++) {
                if (canReachEnd[j] || i + towers[i] >= towers.length) {
                    canReachEnd[i] = true;
                    break;
                }
            }
        }
        return canReachEnd[0];
    }
}
