import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SplitArrayWithSameAvg {
    public static boolean solve(List<Integer> elements) {
        List<Set<Integer>> subSets = new ArrayList<>(elements.size() / 2 + 1);
        for (int i = 0; i < elements.size() / 2 + 1; i++) {
            Set<Integer> subSet = new HashSet<>();
            subSets.add(subSet);
        }
        subSets.get(0).add(0);
        for (Integer element : elements) {
            for (int i = subSets.size() - 1; i > 0; i--) {
                Set<Integer> curentSet = subSets.get(i);
                for (Integer setValue : subSets.get(i - 1)) {
                    curentSet.add(element + setValue);
                }
            }
        }
        int sum = elements.stream().mapToInt(i -> i).sum();
        for (int i = 1; i < subSets.size(); i++) {
            Set<Integer> currentSet = subSets.get(i);
            for (Integer setVal : currentSet) {
                if (setVal == i * sum / elements.size()) {
                    return true;
                }
            }
        }
        return false;
    }
}
