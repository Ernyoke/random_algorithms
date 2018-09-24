import java.util.Map;
import java.util.TreeMap;

public class OrderedPermutation {
    private static char[] solution;

    public static void solve(char input[]) {
        Map<Character, Integer> countChar = new TreeMap<>();
        for (char c : input) {
            countChar.compute(c, (key, value) -> {
               if (value == null) {
                   return 1;
               }
               return value + 1;
            });
        }
        solution = new char[input.length];
        recourse(countChar, 0);
    }

    private static void  recourse(Map<Character, Integer> countChar, int recursionLevel) {
        if (recursionLevel == solution.length) {
            System.out.println(solution);
        } else {
            for (Map.Entry<Character, Integer> entry: countChar.entrySet()) {
                if (entry.getValue() > 0) {
                    solution[recursionLevel] = entry.getKey();
                    countChar.compute(entry.getKey(), (key, value) -> {
                        if (value != null) {
                            return value - 1;
                        }
                        return 0;
                    });
                    recourse(countChar, recursionLevel + 1);

                    // This has to be put to reverse the order of value modification in the map since it wont happen automatically.
                    // This happens because the pointer of the map is passed, not a copy of it.
                    countChar.compute(entry.getKey(), (key, value) -> {
                        if (value != null) {
                            return value + 1;
                        }
                        return 0;
                    });
                }
            }
        }
    }
}
