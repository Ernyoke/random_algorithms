package algoexpoert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinRewards {
    public static int minRewards(int[] scores) {
        List<Integer> localMinPositions = findLocalMinimums(scores);
        int[] rewards = new int[scores.length];
        for (int pos : localMinPositions) {
            int currentPos = pos;
            rewards[currentPos--] = 1;
            while (currentPos >= 0 && scores[currentPos] > scores[currentPos + 1]) {
                rewards[currentPos] = Math.max(rewards[currentPos], rewards[currentPos + 1] + 1);
                currentPos--;
            }
            currentPos = pos + 1;
            while (currentPos < scores.length && scores[currentPos] > scores[currentPos - 1]) {
                rewards[currentPos] = Math.max(rewards[currentPos], rewards[currentPos - 1] + 1);
                currentPos++;
            }
        }
        return Arrays.stream(rewards).sum();
    }

    private static List<Integer> findLocalMinimums(int[] scores) {
        if (scores == null || scores.length == 0) {
            return Collections.emptyList();
        }
        if (scores.length == 1) {
            return Collections.singletonList(0);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (i == 0) {
                if (scores[i + 1] > scores[i]) {
                    result.add(i);
                }
            } else if (i == scores.length - 1) {
                if (scores[i - 1] > scores[i]) {
                    result.add(i);
                }
            } else if (scores[i - 1] > scores[i] && scores[i + 1] > scores[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
