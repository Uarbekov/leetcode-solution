package com.uarbekov.array.hard;

import java.util.ArrayList;
import java.util.List;

public class MaximumGap {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }
    public static int maximumGap(int[] nums) {
        int result = 0;
        List<Integer> sorted = new ArrayList(nums.length);
        for (int num : nums) {


        }
        return result;
    }

//    public int getDifference(ArrayList<Integer> sorted, int val, int startIndex, int endIndex) {
//        if (val <= sorted.get(startIndex)) {
//            sorted.add(startIndex, val);
//        } else if (val > sorted) {
//        }
//        return 0;
//    }
}
