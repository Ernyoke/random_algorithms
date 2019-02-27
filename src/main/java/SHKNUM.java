/*
    Sheokand is good at mathematics. One day, to test his math skills, Kaali gave him an integer N. To impress Kaali,
    Sheokand has to convert N into an integer M that can be represented in the form 2^x+2&y (where x and y are
    non-negative integers such that x≠y). In order to do that, he can perform two types of operations:
    -add 1 to N
    -subtract 1 from N
    However, Sheokand is preparing for his exams. Can you help him find the minimum number of operations required to
    convert N into a valid integer M?
*/

import javafx.util.Pair;

import java.util.*;

public class SHKNUM {
    public static int solveBinarySeach(int n) {
        Set<Integer> precomputed = precompute();
        Pair<Integer, Integer> potentialResults = binarySearch(new ArrayList<>(precomputed), n, 0, precomputed.size());
        return Math.min(Math.abs(potentialResults.getKey() - n), Math.abs(potentialResults.getValue() - n));
    }

    public static int solve(int n) {
        TreeSet<Integer> precomputed = precompute();
        return Math.min(Math.abs(precomputed.floor(n) - n), Math.abs(precomputed.ceiling(n) - n));
    }

    private static TreeSet<Integer> precompute() {
        TreeSet<Integer> precomputed = new TreeSet<>();
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (i != j) {
                    precomputed.add((int) (Math.pow(2, i) + Math.pow(2, j)));
                }
            }
        }
        return precomputed;
    }

    private static Pair<Integer, Integer> binarySearch(ArrayList<Integer> list, int value, int begin, int end) {
        int mid = (begin + end) / 2;
        Pair<Integer, Integer> result;
        int current = list.get(mid);
        if (begin >= end) {
            result = new Pair<>(list.get(mid-1), list.get(mid));
        } else {
            if (current > value) {
                result = binarySearch(list, value, begin, mid);
            }
            else {
                result = binarySearch(list, value, mid + 1, end);
            }
        }
        return result;
    }
}
