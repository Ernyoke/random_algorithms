package norandhistpond;

import java.util.*;

public class NoorAndHisPond {
    public static int solve(List<Fish> fishList) {
        Collections.sort(fishList, (a, b) -> {
            if (a.getSize() == b.getSize()) {
                return a.getEatingFactor() - b.getEatingFactor();
            }
            return a.getEatingFactor() - b.getEatingFactor();
        });
        PriorityQueue<Fish> set = new PriorityQueue<>(Comparator.comparingInt(Fish::getSize));
        set.add(fishList.get(0));
        int max = 1;
        for (int j = 1; j < fishList.size(); j++) {
            Iterator<Fish> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().getSize() <= fishList.get(j).getEatingFactor()) {
                    it.remove();
                } else {
                    break;
                }
            }
            set.add(fishList.get(j));
            if (max < set.size()) {
                max = set.size();
            }
        }
        return max;
    }
}
