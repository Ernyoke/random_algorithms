package algoexpoert;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class KnapsackProblemTest {

    @Test
    public void knapsackProblem() {
        int[][] items = new int[][] {{1, 2}, {4, 3}, {5, 6}, {6, 7}};
        ArrayList<ArrayList<Integer>> actual = KnapsackProblem.knapsackProblem(items, 10);
        System.out.println(actual);
    }


}
