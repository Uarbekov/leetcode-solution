package com.uarbekov.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PlayersScores {
    public static void main(String[] args) {
//        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        int[][] matches = {{1, 5}, {2, 5}, {2, 8}, {2, 9}, {3, 8}, {4, 7}, {4, 9}, {5, 7}, {6, 8}};
        List<List<Integer>> winners = findWinners(matches);
        System.out.println(winners);
    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> oneWinners = new HashSet<>();
        HashSet<Integer> oneLosers = new HashSet<>();
        HashSet<Integer> onlyLosers = new HashSet<>();
        for (int[] match : matches) {
            if (!oneLosers.contains(match[0]) && !onlyLosers.contains(match[0])) {
                oneWinners.add(match[0]);
            }
            if (oneLosers.contains(match[1])) {
                oneLosers.remove(match[1]);
                onlyLosers.add(match[1]);
            }
            if (!oneLosers.contains(match[1]) && !onlyLosers.contains(match[1])) {
                oneWinners.remove(match[1]);
                oneLosers.add(match[1]);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        List res1 = new ArrayList<>(oneWinners);
        List res2 = new ArrayList<>(oneLosers);
        Collections.sort(res1);
        Collections.sort(res2);
        result.add(res1);
        result.add(res2);
        return result;
    }
}
